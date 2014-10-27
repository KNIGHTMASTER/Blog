#include <stdio.h>
int main(){
	int data[5]={3,1,2,5,8};
	int lo=0, hi=5, mid, flag=0,cari,x,key;

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
	scanf("%d",&cari);
	
		while((lo<hi) && (flag==0)){
			mid=(lo+hi)/2;
				if(data[mid]==cari){
					flag=1;
				}
				else{
					if(data[mid]>cari){
						 hi=mid-1;
					}
					else{
						lo=mid+1;
					}
				}
		}
   
		if(flag==1){
			printf("found\n");
		}
		else{
			printf("not found\n");
		}
}
