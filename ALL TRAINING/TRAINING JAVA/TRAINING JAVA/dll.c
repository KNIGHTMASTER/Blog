#include <stdio.h>
#include <stdlib.h>


typedef struct simpul{
	char nama[20];
	int no;
	struct simpul *next,*prev;
}simpul;

typedef struct simpul node;

node *baru,*first,*last,*help;

	int main(){
	int pil;
	char lagi;
	do{
		printf("1.  tambah depan\n");
		printf("2.  tambah balakang\n");
		printf("3.  hapus depan\n");
		printf("4.  hapus belakang\n");
		printf("5.  tampil depan\n");
		printf("6.  tampil belakang\n");
		printf("pilih = ");scanf("%d",&pil);
		/*switch(pil){
			case 1:tdep();
					break;
			case 2:tbel();
					break;
			case 3:hdep();
					break;
			case 4:hbel();
					break;
			case 5:tamdep();
					break;
			case 6:tambel();
					break;
			default:printf("ERROR\n");
		}*/
	printf("lagi = ");scanf("%c",&lagi);scanf("%c",&lagi);
	}
	while(lagi!='t');
	return (0);
	}


