/**
 * @(#)main_antri.java
 *
 *
 * @author 
 * @version 1.00 2011/3/3
 */

import java.util.Scanner;
public class main_antri {

    public static void main(String [] args) {
    	Scanner x=new Scanner(System.in);
    	byte pilih;
    	antrian karcis=new antrian(20);
    	karcis.inisial();
    	System.out.println("masukkan opsi yang anda pilih = ");
    	System.out.println("1.  insert \n");
    	System.out.println("2.  delete \n");
    	System.out.println("3.  reset \n");
    	System.out.println("pilih yang anda mau = ");pilih=x.nextByte();
    		switch(pilih){
    			case 1:    				
    				karcis.insert(data);
    					break;
    			case 2:karcis.delete();
    					break;
    			case 3:karcis.reset();
    					break;
    			default :System.out.println("ERROR\n");
    		}
    	
    }
    
    
}

/*karcis.inisial();
    	karcis.reset();
    	karcis.insert();*/