import java.util.Scanner;
import java.io.*;

class baca{
	public baca(){
	}
	public static void main(String [] args){
		String file="wan.txt";
		try{
		Scanner x=new Scanner(new FileReader("wan.txt"));
			while(x.hasNext()){
				System.out.println(x.nextLine());
			}
		}
		catch(Exception E){
			System.err.println(E);
		}
	}
}