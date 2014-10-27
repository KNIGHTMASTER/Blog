/**
 * @(#)out.java
 *
 *
 * @author 
 * @version 1.00 2011/2/20
 */

import java.io.*;
class out{
	public static void main(String [] args)throws IOException{
		BufferedReader x = new BufferedReader (new InputStreamReader(System.in));
		String input="";
		System.out.print("Masukkan nama file yang akan dibaca = ");input=x.readLine();
		if(input==""){
			System.out.println("data belum diinputkan");
		}
		byte data;
		FileInputStream fin=null;
			try{
			fin=new FileInputStream(input);
				do{
					data=(byte)fin.read();					
					System.out.print((char)data);
				}
				while(data!=-1);
			}
			catch(FileNotFoundException e){
				System.out.println("File is not found");
			}
	}	
}