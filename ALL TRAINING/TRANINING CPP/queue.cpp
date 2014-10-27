#include <iostream.h>

int data[5], f, r;
int value;
void add(){
	if(r<5){
		cout<<"data = ";cin>>value;
		r++;
		data[r]=value;
	}
	else{
		cout<<"antrian penuh"<<endl;
	}
}
void reset(){
	f=0;
	r=-1;
}
void remove(){
	if(f>r-1){
		f++;
		value=data[f];
		if(f==r){
			reset();
		}
	}
	else{
		cout<<"antrian kosong"<<endl;
	}
}
int main(){
int pil, lagi;
reset();
do{
	cout<<"1. add";
	cout<<"2. remove";
	cout<<"3. view";
	cout<<"pilihan = ";cin>>pil;
	switch(pil){
		case 1: add();break;
		case 2: remove();break;
		//case 3: view();break;
		default:cout<<"error"<<endl;
	}
	cout<<"lagi = ";cin>>lagi;
}
while(lagi==1);	
}