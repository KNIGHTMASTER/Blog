#include <stdio.h>

int main(){
int data[5]={4,1,2,5,9};
	for(int a=0;a<5-1;a++){
		for(int b=a+1;b<5;b++){
			if(data[a]>data[b]){
				int temp=data[b];
				data[b]=data[a];
				data[a]=temp;
			}
		}
	}

	for(int a=0;a<5;a++){
		printf("%d  ",data[a]);
	}
	printf("\n");
	return(0);
}
