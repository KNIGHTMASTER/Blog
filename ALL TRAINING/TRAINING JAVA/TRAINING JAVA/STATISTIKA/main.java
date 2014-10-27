/**
 * @(#)main.java
 *
 *
 * @author 
 * @version 1.00 2011/1/29
 */

import java.util.Scanner;
public class main {
public static int [] data=new int[20];
public static int total,a,b,c;
public static int jumlah=0;
public static Scanner x=new Scanner(System.in);
    public main() {
    }
    
    static int masuk(){
		
    	System.out.print("Masukkan jumlah data = ");total=x.nextInt();
    	for(a=1;a<=total;a++){
    		System.out.print("INDEX["+a+"] = ");data[a]=x.nextInt();
    		jumlah+=data[a];
    	}
    	return jumlah;
    }
 	public static void main(String[]args){
 		statistik mulai=new statistik(); 		
 		masuk();
 		mulai.mean(jumlah);
 	}
    
}