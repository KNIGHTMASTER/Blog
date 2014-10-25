import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
/*
	Author : Achmad Fauzi
	fauzi.knightmaster.achmad@gmail.com
*/
public class ListenOnPort{
	public static void main( String [] args ){
		int port = Integer.parseInt( args[0] );
		try{
			ServerSocket serverSocket = new ServerSocket( port );
			new Thread("Device Listener"){
				public void run() {
					try {
						System.out.println("Start Listening on Port "+port);
						Socket socket;
						while ((socket = serverSocket.accept()) != null) {
							System.out.println("| Incoming : "+ socket.toString());
						}
					} catch (Exception e) {				
					}
				};
			}.start();
		}catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}