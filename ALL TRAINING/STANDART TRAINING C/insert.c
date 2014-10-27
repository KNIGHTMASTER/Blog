#include <stdio.h>

int main(){
int data[5]={6,1,2,4,0},key,x;

	for(int a=1;a<5;a++){
		key=data[a];
		x=a-1;
			while(x>=0 && data[x]>key){
				data[x+1]=data[x];
				x--;
				data[x+1]=key;
			}
	}

	for(int a=0;a<5;a++){
		printf("%d  ",data[a]);
	}
	printf("\n");
	return (0);
}
