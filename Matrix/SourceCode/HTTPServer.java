import java.io.*;
import java.net.*;

public class HTTPServer {
  public static void main(String a[]) throws Exception {
    final int httpd = 80;
    ServerSocket ssock = new ServerSocket(httpd);
    System.out.println("have opened port 80 locally");

    Socket sock = ssock.accept();
    System.out.println("client has made socket connection");

    OneConnection client = new OneConnection(sock);
    String s = client.getRequest();
  }
}

class OneConnection { 
  Socket sock;
  BufferedReader in = null;
  DataOutputStream out = null;

  OneConnection(Socket sock) throws Exception{
    this.sock = sock;
     in = new BufferedReader( 
		new InputStreamReader( sock.getInputStream() ) );
     out = new DataOutputStream(sock.getOutputStream());
  }

  String getRequest() throws Exception {
    String s=null;
    while ( (s=in.readLine())!=null) {
       System.out.println("got: "+s);
    }
    return s;
  }
}