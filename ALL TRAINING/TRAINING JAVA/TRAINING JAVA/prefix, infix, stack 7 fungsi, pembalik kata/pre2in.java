import java.util.Scanner;

class data{
	public Scanner dataIn=new Scanner(System.in);
	protected char [] stack=new char[100];
	protected char [] tampung=new char[100];
	protected int topstack=0,toptampung=0;
	public int ukuran;
	String input;
	
	public int getSize(String input){
		int ukuran=input.length();
		return ukuran;
	}
	
	public void setData(){
		System.out.print("masukkan suatu ekspresi prefix = ");input=dataIn.nextLine();
		int size=getSize(input);
		for(int a=0;a<size;a++){
			toptampung++;
			tampung[toptampung]=input.charAt(a);
		}
	}
			
	public void push(char x){
		topstack++;
		stack[topstack]=x;
	}
	
	public char pop(){
	char result;
		if(topstack>0){
		result=stack[topstack];
		topstack--;
		}
		else{
		System.out.println("STACK KOSONG");
		result=0;
		}
	return result;
	}
	
	public boolean isOperator(char x){
	boolean result=false;
		if(x=='+' || x=='-' || x=='/' || x=='*' || x=='^'){
			result=true;
		}
		else{
			result=false;
		}
	return result;
	}
	
	public boolean isCurve(char x){
	boolean result=false;
		if(x=='(' ||x==')' ||x=='[' ||x==']'){
			result=true;
		}
		else{
			result=false;
		}
	return result;
	}
	
	public boolean isOperand(char x){
	boolean result=false;
		if(isOperator(x)==false && isCurve(x)==false){
			result=true;
		}
		else{
			result=false;
		}
	return result;
	}
	
	public char isiTopStack(){
		char x=stack[topstack];
		return x;
	}
}

class operasi extends data{

	public void eksekusi(){
	int size=getSize(input);
	System.out.println("hasil ukuran ="+size);
	String join="";
	int a;
	//do{
		for(a=0;a<size;a++){
			char r=tampung[a];
			if(isOperator(r)==true){
				push(r);
			}
			else if(isOperand(r)==true){
			char x=isiTopStack();
				if(isOperator(x)==true){
					push(x);
				}
				else{
					join+=String.valueOf(pop())+String.valueOf(pop())+String.valueOf(r);
					//push(join);
				}
			}
		}
		System.out.println("hasil = "+join);
	//}while(a!=ukuran);
	}

}

class pre2in{
	public static void main(String [] args){
			operasi x=new operasi();
			x.setData();
			x.eksekusi();
	}
}