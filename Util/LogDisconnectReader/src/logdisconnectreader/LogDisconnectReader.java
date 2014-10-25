/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logdisconnectreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Achmad Fauzi
 * fauzi.knightmaster.achmad@gmail.com
 */
public class LogDisconnectReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        String path = "C:\\Users\\Ladies Man\\Desktop\\DisconnectSample.txt";
        String path = "E:\\LineSample.txt";
        
        BufferedReader br = null;
        List<String> lists = new ArrayList<String>();
        try{
            String currentLine = "";
            br = new BufferedReader( new FileReader( path ));
            while ( (currentLine = br.readLine()) != null) {
                if ( currentLine.contains( "onDisconnect:cause" ) ){
                    String[] splittedEqual = currentLine.split("=");
                    String[] splittedComa = splittedEqual[1].split(",");
                    lists.add( "D:"+splittedComa[0] );
                }
            }            
            System.out.println("============================================LOG DISCONNECT RESULT========================================");
            for ( String list: lists ){
                System.out.println( list );
            }
            
        }catch(IOException exception){
            System.err.println(exception);
        }
    }    
}
