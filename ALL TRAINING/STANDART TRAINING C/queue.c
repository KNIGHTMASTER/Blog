#include <stdio.h>
int data[10],f=0, r=-1;


void reset(){
	f=0;
	r=-1;
}

void enqueue(int x){
	if(r<10-1){
		r+=1;
		data[r]=x;
	}
	else{
		printf("full queue");
	}
}

int dequeue(){
int x;
	if(f<r+1){
		x=data[f];
		data[f]-=data[f];
		f++;
			if(f==r){
				reset();
			}
	}
	else{
		printf("empty queue");
	}
	return x;
}

void show(){
	for(int a=0;a<r+1;a++){
		printf("%d  ",data[a]);
	}
	printf("\n");
}

void in(){
int x;
	printf("masukkan nilai  = ");scanf("%d",&x);
	enqueue(x);
}

int main(){
int pil,x;
char lagi;
do{
	printf("1.  enqueue\n");
	printf("2.  dequeue\n");	
	printf("pilihan = ");scanf("%d",&pil);
		switch(pil){
			case 1:in();break;
			case 2:x=dequeue();break;
			case 3:show();break;
			default:printf("Error\n");
		}
	printf("lagi = ");scanf("%c",&lagi);scanf("%c",&lagi);
}
	while(lagi=='y' || lagi=='Y');
	return (0);
}
