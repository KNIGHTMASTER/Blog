package main;

import java.net.URI;
import java.net.URISyntaxException;

public class URIget {
	
	public static void main( String [] args ){
		String a="";
		System.out.println(a.length());
		try {
			System.out.println(getDomainName("https://drive.google.com/uc?export=download&id=0B6Q9ViSmH0wdeTN6WlVkZHd3Tlk"));			
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static String getDomainName(String url) throws URISyntaxException {
		URI uri = new URI(url);
		String domain = uri.getHost();
		return domain.startsWith("www.") ? domain.substring(4) : domain;
	}
	
}
