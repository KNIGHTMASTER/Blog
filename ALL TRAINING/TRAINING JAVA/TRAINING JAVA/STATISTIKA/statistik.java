/**
 * @(#)statistik.java
 *
 *
 * @author 
 * @version 1.00 2011/1/29
 */

import java.util.Scanner;
public class statistik {
public int [] data=new int[20];
public int total,a,b,c,jumlah=0;
public Scanner x=new Scanner(System.in);
    public statistik() {
    }          
    public void mean(int jumlah){    	    	
		double mean=jumlah/total;
		System.out.println("MEan = "+mean);
    	}
    public void modus(){
    	
    }
}