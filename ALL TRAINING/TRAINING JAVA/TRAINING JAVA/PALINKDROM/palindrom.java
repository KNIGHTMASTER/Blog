/**
 * @(#)palindrom.java
 *
 *
 * @author 
 * @version 1.00 2011/1/29
 */

import java.io.*;
import java.util.Scanner;
public class palindrom{

    public palindrom() {
    }
    public static void main(String[]args)throws IOException{
    	String data="",bolak="";
    	char []beda=new char[10];
    	char []sama=new char[10];
    	char i;
int length,a,b;
    	BufferedReader x=new BufferedReader (new InputStreamReader(System.in));    	
    		
    		System.out.print("Masukkan data = ");data=x.readLine();    	    	
	    	length=data.length();    	
	    		StringBuffer balik=new StringBuffer(length);
    		for(a=length-1;a>=0;a--){
    			i=data.charAt(a);
    			balik.append(i);    			
    		}
    		bolak=balik.toString();
    		System.out.println(data);
    		System.out.println(bolak);
    		
    		if(data.equals(bolak)){
    			System.out.println("PALINDROM\n"+data+" == "+balik);
    		}
    		else if(!data.equals(bolak)){
    			System.out.println("NOT PALINDROM\n"+data+" != "+balik);
    		}
    	
    }    
}