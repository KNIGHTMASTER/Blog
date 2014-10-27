#include <stdio.h>
typedef struct mahasiswa{
	char nama[20];
	char nrp[13];
	char alamat[25];
}mahasiswa;

mahasiswa mhs[4];
int main(){
	for(int a=0;a<1;a++){
		printf("Masukkan nama = ");scanf("%s",mhs[a].nama);
		printf("Masukkan nrp = ");scanf("%s",mhs[a].nrp);
		printf("Masukkan alamat = ");scanf("%s",mhs[a].alamat);
	}

	for(int a=0;a<1;a++){
		printf("nama = %s\n",mhs[a].nama);
		printf("nrp = %s\n",mhs[a].nrp);
		printf("alamat = %s\n",mhs[a].alamat);
	}
}
