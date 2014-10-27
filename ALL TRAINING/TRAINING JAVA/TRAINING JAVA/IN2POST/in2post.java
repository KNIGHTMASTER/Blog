/**
 * @(#)in2post.java
 *
 *
 * @author 
 * @version 1.00 2011/2/7
 */

import java.util.Scanner;
public class in2post {
	
public char [] stack=new char[10];
public int top=0,a,b;
public char [] data=new char[10];
public Scanner x=new Scanner(System.in);
String input,output="";

    public in2post() {
    }

void proses(){
	
	reset_stack();
	System.out.print("Masukkan notasi INFIX = ");input=x.nextLine();
	data=input.toCharArray();
	for(a=0;a<=input.length()-1;a++){
		if(isoperand(data[a])){
			System.out.println("\n Loop ke"+a+"adalah operand");
			output+=String.valueOf(data[a]);
		}
		if(data[a]=='('){
			push(data[a]);
		}
		if(data[a]==')'){
			char t=pop();
			do{
				output+=t;
				t=pop();
			}
			while(t!='(');
		}
		if(isoperator(data[a])){			
			System.out.println("\n Loop ke"+a+"adalah operator");			
				if(top<=0){
					push(data[a]);
				}
				else if(isitopstack()=='('){
					push(data[a]);
				}
				else if(rlebihtinggi(data[a])){
					push(data[a]);
				}
				else{
					char t;
					do{
						t=pop();
						output+=String.valueOf(t);
					}
					while(top>=0);
				}
				
		}
System.out.println("isi data= "+data[a]);						
System.out.println("isi output= "+output);			
System.out.println("isi top= "+top);			
		}
		String hasil="";
		do{
			hasil+=String.valueOf(pop());
			System.out.println("isi hasil= "+hasil);			
		}
		while(top>0);
		output+=hasil;
		System.out.println(output);
	}
	//output+=output;
void reset_stack(){
	top=0;
}
char pop(){
	char ambil;
	if(top>0){
	ambil=stack[top];
	top--;
	}
	else{
		ambil=' ';
	}
	return ambil;
}
void push(char masuk){	
	top++;
	stack[top]=masuk;
}
boolean isoperator(char t){
	boolean hasil1;
	hasil1=false;
	//t=t.trim();
	if(t=='+'){
		hasil1=true;
	}
	else if(t=='-'){
		hasil1=true;
	}
	else if(t=='/'){
		hasil1=true;
	}
	else if(t=='*'){
		hasil1=true;
	}
	else if(t=='^'){
		hasil1=true;
	}
	return hasil1;
}
boolean iskurung(char t){
	boolean hasil1;
	hasil1=false;
	if(t=='('){
		hasil1=true;
	}
	else if(t==')'){
		hasil1=true;
	}
	else if(t==']'){
		hasil1=true;
	}
	else if(t=='['){
		hasil1=true;
	}
	return hasil1;
}
boolean isoperand(char t){
	boolean hasil1;
	hasil1=false;
	if (isoperator(t)==false && iskurung(t)==false){
		hasil1=true;
	}
	return hasil1;
}
boolean rlebihtinggi(char t){	
	int levelr=0;
	int leveltopstack=0;
	boolean rlebihtinggi=false;
	if(t=='+' || t=='-'){
		levelr=1;
	}
	else if(t=='*' || t=='/'){
		levelr=2;
	}
	else if(t=='^'){
		levelr=3;
	}
	
	if(isitopstack()=='+' || isitopstack()=='-'){
		leveltopstack=1;
	}
	else if(isitopstack()=='*' || isitopstack()=='/'){
		leveltopstack=2;
	}
	else if(isitopstack()=='^'){
		leveltopstack=3;
	}
	else{
		levelr=0;
	}
	if(levelr>leveltopstack){
		rlebihtinggi=true;
	}
	else if(levelr>leveltopstack){
		rlebihtinggi=false;
	}
	return rlebihtinggi;
}
char isitopstack(){
	char isitopstack;
	isitopstack=(stack[top]);
	return isitopstack;
}
}