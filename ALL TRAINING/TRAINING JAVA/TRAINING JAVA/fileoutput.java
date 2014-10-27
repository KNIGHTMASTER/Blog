/**
 * @(#)fileoutput.java
 *
 *
 * @author 
 * @version 1.00 2011/2/19
 */

import java.io.*;
public class fileoutput {

    public static void main(String [] args) throws IOException{
    	BufferedReader x=new BufferedReader (new InputStreamReader(System.in));
    	String masuk="";
    	System.out.print("Masukkan nama file yang akan dibuat = ");masuk=x.readLine();
    	if(masuk==""){
    		System.out.println("NAMA file belum Diinputkan");
    		System.exit(0);
    	}    	
    		byte data;
    		FileOutputStream keluar=null;
    		try{
    			keluar = new FileOutputStream (masuk);
    			data=(byte)System.in.read();
    			while(data!=(byte)'Q'){
    				keluar.write(data);    				
    				data=(byte)System.in.read();    	
    			}   			    			
    		}
    		catch(FileNotFoundException e){
    			System.out.println("File tidak ditemukan");
    		}
    		catch(IOException e){
    			System.out.println("ERROR = "+e);
    		}
    		finally{
	   			if(keluar!=null){
    				try{
    					keluar.close();
    				}
    				catch(Exception e){
    					System.out.println("ERROR");
    				}
    			}			
    		}
    	}
    }