//program pembalik kata berdasarkan spasi menggunakan konsep PBO

import java.util.Scanner;
class stack_kata{
public int panjang;
public String kalimat="";
public int top=0;
public String [] kata=new String[10];
public Scanner dataIn=new Scanner(System.in);
	public void setKalimat(String kalimat){
		this.kalimat=kalimat;
	}
	public String getKalimat(){
		return kalimat;
	}
	public int getPanjang(){
		panjang=kalimat.length();
		return panjang;	
	}
}

class pembalik extends stack_kata{

	void push(String temp){
		top++;
		kata[top]=temp;
	}
	
	String pop(int top){
		String temp=kata[top];
		top--;
		return temp;
	}

	public void exchange(){
	String temp="";
		for(int a=0;a<panjang;a++){
			temp+=String.valueOf(kalimat.charAt(a));
			if(kalimat.charAt(a)==' '){
			push(temp);
			temp="";
			}
		}
	push(temp);
	}

	public void show(){
	String temp="";
		for(int a=top;a>=1;a--){
		temp+=pop(a)+" ";
		}
		System.out.println("kalimat yang terbalik adalah = "+temp);
	}
}

class reverse_word{
	public static void main(String [] args){
	Scanner dataIn=new Scanner(System.in);
	String input="";
		pembalik kataterbalik=new pembalik();
		System.out.print("masukkan suatu kalimat =");input=dataIn.nextLine();
		kataterbalik.setKalimat(input);
		kataterbalik.getKalimat();
		kataterbalik.getPanjang();
		kataterbalik.exchange();	
		kataterbalik.show();
	}
}
