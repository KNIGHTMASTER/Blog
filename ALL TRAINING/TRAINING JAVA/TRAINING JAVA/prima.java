/**
 * @(#)prima.java
 *
 *
 * @author 
 * @version 1.00 2011/2/24
 */
import java.util.Scanner;

public class prima {

    public static void main(String [] args) {
    	int bil;
    	boolean prima=false;
    	Scanner x=new Scanner(System.in);
 		System.out.print("masukkan suatu bilangan = ");bil=x.nextInt();
 		if(bil==2){
 			prima=true;
 		}
 		else{
 			for(int a=2;a<=bil-1;a++){
 				if(bil%2==0){
 					prima=false;
 				}
 				else{
 					prima=true;
 				}
 			}
 		}
 		if(prima==true){
 			System.out.println("bilangan "+bil+" adalah bilangan prima");
 		}
 		else{
 			System.out.println("bilangan "+bil+" bukan bilangan prima");
 		}
    }
    
    
}