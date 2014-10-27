#include <stdio.h>

int top=-1;
int data[10];

void push(int a){
	if(top<10){
		top++;
		data[top]=a;
	}
	else{
		printf("full\n");
	}	
}

int pop(){
	int a;
		if(top>0){
			a=data[top];
			top--;
		}
		else{
			printf("kosong\n");
		}
		return a;
}

void in(){
int x;
	printf("masukkan nilai = ");scanf("%d",&x);
	push(x);
}

void show(){
printf("top = %d\n",top);
printf("%d",data[top]);
	for(int a=top;a>0;a--){
		printf("%d  ",data[a]);
	}
}

int main(){
int go;
char lagi;
do{
	printf("STACK\n");
	printf("1.push\n");
	printf("2.pop\n");
	printf("3.show\n");
	printf("GO = ");scanf("%d",&go);
		switch(go){
			case 1:in();break;
			case 2:pop();break;
			case 3:show();break;
		}
	printf("lagi = ");scanf("%c",&lagi);scanf("%c",&lagi);
}
	while(lagi=='y' || lagi=='Y');
	
	return (0);
}
