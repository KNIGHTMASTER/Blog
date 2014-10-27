#include <stdio.h>

int main(){
	int a, b, n, data[10];
	scanf("%d", &n);
	for(a=0;a<n;a++){
		scanf("%d", &data[a]);
	}


	for(a=0;a<n;a++){
	for(int z=0;z<data[a];z++){
			for(b=0;b<=data[a];b++){
				for(int c=0;c<data[a]-b;c++){
					printf(" ");
				}
				for(int d=data[a]-b;d<=data[a];d++){
					printf("*");
				}
				for(int e=data[a]-b;e<data[a];e++){
					printf("*");
				}
				printf("\n");
				}
	}
	}

}
