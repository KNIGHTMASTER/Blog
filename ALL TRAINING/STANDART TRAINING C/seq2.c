#include <stdio.h>
int tabInt[10]= {34,67,23,28,98,15,89,67,28,18};

void main()
{
	int i,bil_cari,ketemu;

	i=0;
//	bil_cari=89;
	ketemu = 0;

	scanf("%d",&bil_cari);
	while((i<10) && (ketemu==0))
	{
		if(tabInt[i] == bil_cari)
			ketemu=1;
		
		else
			i=i+1;
	}

   	if(ketemu == 1)
		printf("data ada dalam larik\n");
	else
		printf("data tidak ada dalam larik\n");
}

