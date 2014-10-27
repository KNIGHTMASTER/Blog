/**
 * @(#)tujuh.java
 *
 *
 * @author 
 * @version 1.00 2011/1/29
 */

import java.util.Scanner;
public class tujuh {

    public tujuh() {
    }
    public static void main(String [] args){
    	Scanner x=new Scanner(System.in);
    	int awal,akhir,jumlah=0,a;
		System.out.print("Masukkan range Awal = ");awal=x.nextInt();
		System.out.print("Masukkan range Akhir = ");akhir=x.nextInt();
		for(a=awal;a<=akhir;a++){
			jumlah+=a;
		}
		System.out.print(jumlah+"\n");
    }
    
    
}