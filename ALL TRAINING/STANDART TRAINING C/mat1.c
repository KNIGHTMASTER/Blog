#include <stdio.h>

int mat1[10][10], mat2[10][10],ordo, ordo2,mat3[10][10], mat4[10][10];
void buat(){
	printf("Matrix ke -1\n");
	printf("Masukkan nilai ordo = ");scanf("%d",&ordo);
		for(int a=0;a<ordo;a++){
			for(int b=0;b<ordo;b++){
				printf("Index ke [%d,%d]",a,b);scanf("%d",&mat1[a][b]);
			}
		}
	printf("Matrix ke -2\n");
	printf("Masukkan nilai ordo = ");scanf("%d",&ordo2);
		for(int a=0;a<ordo2;a++){
			for(int b=0;b<ordo2;b++){
				printf("Index ke [%d,%d]",a,b);scanf("%d",&mat2[a][b]);
			}
		}		
}

void cetak(){
	for(int a=0;a<ordo;a++){
		for(int b=0;b<ordo;b++){
			printf("%d  ",mat1[a][b]);
		}
		printf("\n");
	}
	printf("\n");
	for(int a=0;a<ordo;a++){
		for(int b=0;b<ordo;b++){
			printf("%d  ",mat1[a][b]);
		}
		printf("\n");
	}
}

void jumlah(){
	for(int a=0;a<ordo;a++){
		for(int b=0;b<ordo;b++){
			mat3[a][b]=mat1[a][b]+mat2[a][b];
		}
	}
	for(int a=0;a<ordo;a++){
		for(int b=0;b<ordo;b++){
			printf("%d  ",mat3[a][b]);
		}
		printf("\n");
	}	
}

void kali(){
	for(int a=0;a<ordo;a++){
		for(int b=0;b<ordo;b++){
			for(int c=0;c<ordo;c++){
				mat4[a][b]=mat4[a][b]+mat1[a][c]*mat2[c][b];
			}
		}
	}
	for(int a=0;a<ordo;a++){
		for(int b=0;b<ordo;b++){
			printf("%d  ",mat4[a][b]);
		}
		printf("\n");
	}
}

int main(){
buat();
cetak();
jumlah();
kali();
}
