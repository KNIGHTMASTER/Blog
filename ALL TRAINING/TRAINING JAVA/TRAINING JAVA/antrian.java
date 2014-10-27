/**
 * @(#)antrian.java
 *
 *
 * @author 
 * @version 1.00 2011/3/3
 */

import java.io.*;
public class antrian {
private int [] data;
private int panjang;
private int F,R;
InputStreamReader y=new InputStreamReader(System.in);
BufferedReader z=new BufferedReader(y);
    public antrian(int panjang) {
    	data=new int[panjang];
    	this.panjang=panjang;
    }
    void inisial(){
    	F=0;
    	R=-1;
	} 
	void reset(){
		F=0;
		R=-1;	
	}
	void insert()throws IOException{
		String masuk;
		int data;
		System.out.print("masukkan data inputan =");masuk=z.readLine();
		if(R<=panjang-1){
			R++;
			data=Integer.parseInt(masuk);
			data[R]=data;
		}
		else{
			System.out.println("ANTRIAN PENUH");
		}
	}
	char delete(){
	int ambil=data[F];
		if(F<R+1){
			F++;
			if(F==panjang){
				reset();
			}
		}
		else{
			System.out.println("ANTRIAN KOSONG");
		}
		return ambil;
	}
}