/**
 * @(#)FAKTORIAL.java
 *
 *
 * @author 
 * @version 1.00 2011/2/7
 */

import java.util.Scanner;

public class FAKTORIAL {

    public static void main(String[]args) {
    	int x,y;
    	Scanner scan=new Scanner(System.in);
    	System.out.print("Masukkan angka yang akan dilakukan proses faktorial = ");x=scan.nextInt();
    	System.out.println("Hasil dari faktorial "+x+"! = ");
    	for(y=x-1;y>=1;y--){
    		x*=y;
    	}
    	System.out.print(x);
    }
    
    
}