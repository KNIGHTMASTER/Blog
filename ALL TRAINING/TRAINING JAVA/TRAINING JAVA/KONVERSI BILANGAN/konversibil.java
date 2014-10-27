/**
 * @(#)konversibil.java
 *
 *
 * @author 
 * @version 1.00 2011/1/16
 */

import java.util.Scanner;
import java.io.*;
public class konversibil {
public Scanner x=new Scanner(System.in);
int a,b,des,des2bin;
double masuk;
    public konversibil() {    	
    }
public void masuk_des(){
	System.out.print("Masukkan sebuah bilangan desimal = ");des=x.nextInt();
	}
public void destobin(){
	String temp="",temp2="";
	do{
		des2bin=des % 2;
		temp+=String.valueOf(des2bin)+" ";
	}	
	while(des2bin!=0);
	temp2+=temp;
	System.out.println("Konversi bilangan "+des+" ke Biner adalah = "+temp2);
	}
   
}