/**
 * @(#)in2pre.java
 *
 *
 * @author 
 * @version 1.00 2011/2/9
 */

import java.util.Scanner;

public class in2pre {

public char [] stack=new char[10];
public int top=0,a;
public char [] data=new char[10];
public Scanner x=new Scanner(System.in);
String input,output="";

    public in2pre() {
    }
void proses(){	
	reset_stack();
	System.out.print("Masukkan notasi INFIX = ");input=x.nextLine();
	data=input.toCharArray();
	char r=0;
	for(a=0;a<=input.length()-1;a++){
		r=data[a];
		if(isoperand(r)){
			output+=String.valueOf(r);
		}
		else if(r==')'){
			push(r);
		}
		else if(isoperator(r)){
			if(top<=0){
				push(r);
			}
			else if(isitopstack()==')'){
				push(r);
			}
			else if(rlebihtinggisamadengan(r)){
				push(r);
			}
			else {
				char t;
					do{
				t=pop();
				output+=String.valueOf(t);
					}	
				while(top>=0);
			}
		}
		else if(r=='('){
			char t=0;
			t=pop();
			do{
				output+=String.valueOf(t);
				t=pop();
			}
			while(t!=')');
		}
	}
	do{
		output+=pop();
	}
	while(top>0);
	String t="";
	for(a=input.length()-1;a>=0;a--){
		t+=String.valueOf(output.charAt(a));
	}
	output="";
	output+=t;
	System.out.println(output);
}	
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
boolean rlebihtinggisamadengan(char t){	
	int levelr=0;
	int leveltopstack=0;
	boolean rlebihtinggisamadengan=false;
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
	if(levelr>=leveltopstack){
		rlebihtinggisamadengan=true;
	}
	else if(levelr>leveltopstack){
		rlebihtinggisamadengan=false;
	}
	return rlebihtinggisamadengan;
}
char isitopstack(){
	char isitopstack;
	isitopstack=(stack[top]);
	return isitopstack;
}
}