#include <stdio.h>

main(){
int data[5]={5,1,2,9,7},flag;
int a,cari;

	printf("Masukkan yang dicari = ");scanf("%d",&cari);
	
		a=0;
		while((a<5) && (flag==0)){
			if(data[a]==cari)
				flag==1;
			else
				a=a+1;
		}
		
		if(flag==0)
			printf("ketemu\n");
		else
			printf("NGGAK\n");			
}
