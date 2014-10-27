#include <stdio.h>

int rekursif(int value){
	if(value==1){
		return 1;
	}
	else{
		return(value*(rekursif(value-1)));
	}
}

int main(){
int nilai;
	scanf("%d",&nilai);
	printf("%d\n",rekursif(nilai));
}
