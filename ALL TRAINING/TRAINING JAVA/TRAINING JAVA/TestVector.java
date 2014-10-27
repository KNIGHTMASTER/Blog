/**
 * @(#)TestVector.java
 *
 *
 * @author 
 * @version 1.00 2011/3/4
 */

import java.util.*;
import java.io.*;
public class TestVector {

    public static void main(String [] args) {
    	Scanner x=new Scanner(System.in);
    	int size;
    	Vector<Integer> vector=new Vector<Integer>(5);
    	for(int a=0;a<=5-1;a++){
    		int data=x.nextInt();
    		vector.add(data);
    	}
    	for(int a=0;a<=5-1;a++){
    		System.out.println("Isi Vector ke -"+a+"adalah ="+vector.get(a));
    	}
    }
    
    
}