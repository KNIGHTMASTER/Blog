/**
 * @(#)dua.java
 *
 *
 * @author 
 * @version 1.00 2011/1/29
 */

import java.util.Scanner;
public class dua {
int x,y,length,divisors=0,maxdivisors,numWithMax;

public Scanner z=new Scanner(System.in);
    public dua() {
    }
    public void jalan(){
    	System.out.print("Masukkan Besarnya Data = ");length=z.nextInt();
    	for(x=2;x<=length;x++){
    		for(y=1;y<=x;y++){
    			if(x%y==0){
    				divisors++;
    			}    			
    		}
    		if(maxdivisors>divisors){
    			maxdivisors=divisors;
    			numWithMax=x;
    		}
    	}   	
		System.out.println("Bilangan yang memiliki pembagi terbanyak adalah = "+x);
		System.out.println("Jumlah pembaginya adalah = "+divisors);
		System.out.println("Bilangan yang memiliki pembagi terbanyak adalah = "+numWithMax);
    	}
    
}