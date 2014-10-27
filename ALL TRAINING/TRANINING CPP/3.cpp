#include <stdio.h>

int main(){
	int n, data[10];
	scanf("%d", &n);
	for(int a=0;a<n;a++){
		scanf("%d", &data[a]);
	}

	for(a=0;a<n;a++){
		for(int b=0;b<data[a];b++){
		//isin
			for(int d=0;d<data[a]-b;d++){
					printf("*");
			}
						printf("\n");
			//batas isi
		}
		printf("\n");
	}
}