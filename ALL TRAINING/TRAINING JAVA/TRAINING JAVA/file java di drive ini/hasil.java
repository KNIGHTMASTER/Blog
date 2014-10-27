/*	Author : Achmad Fauzi
	Simpan dengan nama :hasil.java
*/

import java.util.Scanner;

class awal{
protected int [][] mat1;
protected int [][] mat2;
protected int [][] matsum,matmulti,matmin;
protected int bar1,kol1,bar2,kol2;
public Scanner dataIn=new Scanner(System.in);	
	public void setBar1(int bar1){		
		this.bar1=bar1;		
	}
	public int getBar1(){
		return bar1;
	}
	
	public void setKol1(int kol1){
		this.kol1=kol1;		
	}
	public int getKol1(){
		return kol1;
	}
	
	public void setBar2(int bar2){
		this.bar2=bar2;		
	}
	public int getbar2(){
		return bar2;
	}
	
	public void setKol2(int kol2){
		this.kol2=kol2;		
	}
	public int getKol2(){
		return kol2;
	}	
}

class konstruksi extends awal{

	public konstruksi(int bar1,int kol1,int bar2, int kol2, int barhasil,int kolhasil){
	mat1=new int[bar1][kol1];
	mat2=new int[bar2][kol2];
	matsum=new int[barhasil][kolhasil];
	matmin=new int[barhasil][kolhasil];
	matmulti=new int[barhasil][kolhasil];
	}
	public void isiMatrix1(){	
	System.out.println("pengisian matrix ke 1");
		for(int a=0;a<bar1;a++){
			for(int b=0;b<kol1;b++){
				System.out.print("masukkan isi Matrix 1 elemen ke["+a+1+","+b+1+"]=");mat1[a][b]=dataIn.nextInt();
			}
		}		
	}
	public void cetakMatrix1(){
	System.out.println("matrix ke 1");
		for(int a=0;a<bar1;a++){
			for(int b=0;b<kol1;b++){
				System.out.print(mat1[a][b]+"  ");
			}
		System.out.println();	
		}
	}

	public void isiMatrix2(){
	System.out.println("pengisian matrix ke 2");
		for(int a=0;a<bar1;a++){
			for(int b=0;b<kol1;b++){
				System.out.print("masukkan isi Matrix 1 elemen ke["+a+1+","+b+1+"]=");mat2[a][b]=dataIn.nextInt();
			}
		}		
	}
	public void cetakMatrix2(){
	System.out.println("matrix ke 2");
		for(int a=0;a<bar1;a++){
			for(int b=0;b<kol1;b++){
				System.out.print(mat2[a][b]+"  ");
			}
		System.out.println();	
		}
	}
	public void penjumlahan(){
		if(bar1!=bar2){
			System.out.println("ordo antar kedua matrix berbeda");
		}
		else{
			for(int a=0;a<bar1;a++){
				for(int b=0;b<kol1;b++){
					matsum[a][b]=mat1[a][b]+mat2[a][b];
				}
			}
		}
		//cetak hasil jumlah
		System.out.println("hasil penjumlahan ");
		for(int a=0;a<bar1;a++){
			for(int b=0;b<kol1;b++){
				System.out.print(matsum[a][b]+"  ");
			}
		System.out.println();	
		}
	}
	public void pengurangan(){
		if(bar1!=bar2){
			System.out.println("ordo antar kedua matrix berbeda");
		}
		else{
			for(int a=0;a<bar1;a++){
				for(int b=0;b<kol1;b++){
					matsum[a][b]=mat1[a][b]+mat2[a][b];
				}
			}
		}
		//cetak hasil kurang
		System.out.println("hasil pengurangan ");
		for(int a=0;a<bar1;a++){
			for(int b=0;b<kol1;b++){
				System.out.print(matmin[a][b]+"  ");
			}
		System.out.println();	
		}
	}
	public void perkalian(){
		if(kol1!=bar2){
			System.out.println("Jumlah kolom matrix ke-1 tidak sama dengan jumlah baris matrix ke-2");
		}
		else{
			for(int a=0;a<bar1;a++){
				for(int b=0;b<kol2;b++){
					for(int c=0;c<kol1;c++){
						matmulti[a][b]=matmulti[a][b]+mat1[a][c]*mat2[c][b];
					}
				}
			}
		}
		//cetak hasil kali
		System.out.println("hasil perkalian ");
		for(int a=0;a<bar1;a++){
			for(int b=0;b<kol2;b++){
				System.out.print(matmulti[a][b]+"  ");
			}
		System.out.println();	
		}
	}
}

class hasil{
	public static void main(String [] args){
	Scanner dataIn=new Scanner(System.in);
	int bar1,kol1,bar2,kol2;
			System.out.println("program operasi matrix menggunakan konsep OOP");
			konstruksi matrix=new konstruksi(10,10,10,10,20,20);
			
			System.out.print("masukkan jumlah baris matrix ke-1 = ");bar1=dataIn.nextInt();matrix.setBar1(bar1);
			System.out.print("masukkan jumlah kolom matrix ke-1 = ");kol1=dataIn.nextInt();matrix.setKol1(kol1);
			matrix.isiMatrix1();
						
			System.out.print("masukkan jumlah baris matrix ke-2 = ");bar2=dataIn.nextInt();matrix.setBar2(bar2);
			System.out.print("masukkan jumlah kolom matrix ke-2 = ");kol2=dataIn.nextInt();matrix.setKol2(kol2);
			matrix.isiMatrix2();
			
			matrix.cetakMatrix1();
			matrix.cetakMatrix2();
			
			matrix.penjumlahan();
			matrix.pengurangan();
			matrix.perkalian();
						
	}
}