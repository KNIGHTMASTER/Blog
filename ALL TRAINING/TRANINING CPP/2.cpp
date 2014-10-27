#include <stdio.h>

int main(){
	int n, data1[10],m, hasil, max;
	scanf("%d", &n);
	int total[10];
	//3
	for(int a=0; a<n;a++){
	//6
		scanf("%d", &m);
		for(int b=0;b<m;b++){
			scanf("%d", &data1[b]);
		}
		//banding data
		for(int c=0;c<5;c++){
			for(int d=0;d<m;d++){
				max=data1[0];
				if(data1[d]>max){
					max=data1[d];
				}
			}
			hasil+=max;
		}
		total[a]=hasil;
	}
	printf("output\n");
	for(a=0;a<n;a++){
		printf("%d\n", total[a]);
	}
}