/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jnetpcapexample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.jnetpcap.Pcap;
import org.jnetpcap.PcapIf;
import org.jnetpcap.packet.PcapPacket;
import org.jnetpcap.packet.PcapPacketHandler;
import org.jnetpcap.protocol.network.Arp;
import org.jnetpcap.protocol.tcpip.Http;
import org.jnetpcap.protocol.tcpip.Tcp;


/**
 *
 * @author Ladies Man
 */
public class PacketCapturer {

    public static void main( String  [] args ){
        try {
            // Will be filled with NICs
            List<PcapIf> alldevs = new ArrayList();

            // For any error msgs
            StringBuilder errbuf = new StringBuilder();

            //Getting a list of devices
            int r = Pcap.findAllDevs(alldevs, errbuf);
            System.out.println(r);
            if (r != Pcap.OK) {
                System.err.printf("Can't read list of devices, error is %s", errbuf.toString());
                return;
            }

            System.out.println("Network devices found:");
            int i = 0;
            for (PcapIf device : alldevs) {
                String description =(device.getDescription() != null) ? device.getDescription(): "No description available";
                System.out.printf("#%d: %s [%s]\n", i++, device.getName(), description);
            }
            System.out.println("choose the one device from above list of devices");
            int ch = new Scanner(System.in).nextInt();
            PcapIf device = alldevs.get(ch);

            int snaplen = 64 * 1024;           // Capture all packets, no trucation
            int flags = Pcap.MODE_PROMISCUOUS; // capture all packets
            int timeout = 10 * 1000;           // 10 seconds in millis

            //Open the selected device to capture packets
            Pcap pcap = Pcap.openLive(device.getName(), snaplen, flags, timeout, errbuf);

            if (pcap == null) {
                System.err.printf("Error while opening device for capture: "+ errbuf.toString());
                return;
            }
            System.out.println("device opened");

            //Create packet handler which will receive packets
            PcapPacketHandler jpacketHandler = new PcapPacketHandler() {
                Arp arp = new Arp();
                Http http = new Http();
                Tcp tcp = new Tcp();
                @Override
                public void nextPacket(PcapPacket jHeaders, Object o) {
                    //Here i am capturing the ARP packets only,you can capture any packet that you want by just changing the below if condition
//                    if (jHeaders.hasHeader(arp)) {
//                        System.out.println("Hardware type" + arp.hardwareType());
//                        System.out.println("Protocol type" + arp.protocolType());
//                        System.out.println("Packet:" + arp.getPacket());
//                        System.out.println();
//                    }
                    
                    if ( jHeaders.hasHeader( http ) ){
                        System.out.println("Header = " + http.header());
                        System.out.println("Content Type = " + http.contentType());
                        System.out.println("Info = " + http.contentTypeEnum());
                    }
                    
//                    if ( jHeaders.hasHeader(tcp)) {  
//                        System.out.printf("#%d seq=%08X%n", jHeaders.getFrameNumber(), tcp.seq());  
//                    }  
                }
            };            
            pcap.loop(Pcap.LOOP_INFINITE, jpacketHandler, "");
            pcap.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }}
