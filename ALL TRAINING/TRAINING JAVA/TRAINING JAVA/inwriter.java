/**
 * @(#)inwriter.java
 *
 *
 * @author 
 * @version 1.00 2011/2/20
 */

import java.io.*;
public class inwriter {

    public static void main(String [] args)throws IOException{
    	BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
    	String masuk="";
    	System.out.print("masukkan nama file yang akan dibaca = ");masuk=x.readLine();
    	if(masuk==""){
    		System.out.println("Data yang anda masukkan tidak ada");
    	}
    	FileReader baca=null;
    	String trace;
    	try{
    		baca=new FileReader(masuk);
    		BufferedReader z=new BufferedReader(baca);    		
    		do{    			
    			trace=z.readLine();
    			System.out.print(trace);
    		}
    		while(trace!=null);
    	}
    	catch(FileNotFoundException e){
    		System.out.println("File is not found");
    	}
    	catch(IOException e){
    		System.out.println("System is error");
    	}
    	finally{
    		try{
    			if(baca!=null){
    				baca.close();
    			}
    		}
    		catch(IOException e){
    			System.out.print("System Error");
    		}
    	}
    }
    
    
}