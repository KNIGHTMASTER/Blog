import java.util.Scanner;

class matrix{
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

class konstruksi extends matrix{

	public konstruksi(int bar1,int kol1,int bar2, int kol2){
	mat1=new int[bar1][kol1];
	mat2=new int[bar2][kol2];
	}
	public void isiMatrix1(){
		for(int a=0;a<bar1;a++){
			for(int b=0;b<kol1;b++){
				System.out.print("masukkan isi Matrix 1 elemen ke["+a+1+","+b+1+"]=");mat1[a][b]=dataIn.nextInt();
			}
		}		
	}
	public void cetakMatrix1(){
		for(int a=0;a<bar1;a++){
			for(int b=0;b<kol1;b++){
				System.out.print(mat1[a][b]+"  ");
			}
		System.out.println();	
		}
	}

	public void isiMatrix2(){
		for(int a=0;a<bar1;a++){
			for(int b=0;b<kol1;b++){
				System.out.print("masukkan isi Matrix 1 elemen ke["+a+1+","+b+1+"]=");mat2[a][b]=dataIn.nextInt();
			}
		}		
	}
	public void cetakMatrix2(){
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
	}
	public void perkalian(){
		if(kol1!=bar2){
			System.out.println("Jumlah kolom matrix ke-1 tidak sama dengan jumlah baris matrix ke-2");
		}
		else{
			for(int a=0;a<bar1;a++){
				for(int b=0;b<kol2;b++){
					for(int c=0;c<kol1;c++){
						matmulti[a][b]=matmulti[a][b]+mat1[a][c]*matmulti[c][b];
					}
				}
			}
		}
	}
}

class hasil{
	public static void main(String args){
		
	}
}