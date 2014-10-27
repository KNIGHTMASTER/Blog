#include <iostream.h>
#include <stdlib.h>

typedef struct data{
	int info;
	struct data *next;
}data;

typedef data node;

node *baru,*depan,*belakang,*bantu;

void tdep(){
	baru=new (node);
	if(baru!=NULL){
		cout<<"masukkan info = ";cin>>baru->info;
		if(depan==NULL){
			depan=belakang=baru;
		}
		else{
			baru->next=depan;
			depan=baru;
		}
	}
	else{
		cout<<"data berhasil masuk"<<endl;
	}
};

void tbel(){
	baru=new (node);
	if(baru!=NULL){
		cout<<"Masukkan data = ";cin>>baru->info;
		if(depan==NULL){
			depan=belakang=baru;
		}
		else{
			belakang->next=baru;
			belakang=baru;
		}
	}
	else{
		cout<<"memori penuh"<<endl;
	}
};

void hdep(){
	if(depan==NULL){
		cout<<"data kosong"<<endl;
	}
	else if(depan==belakang){
		free(depan);
		depan=belakang=NULL;
	}
	else{
		bantu=depan;
		depan=depan->next;
		free(bantu);
	}
};

void hbel(){
	if(depan==NULL){
		cout<<"data kosong"<<endl;
	}
	else if(depan==belakang){
		free(depan);
		depan=belakang=NULL;
	}
	else{
		bantu=depan;
			while(bantu->next!=belakang){
				bantu=bantu->next;
			}
			free(belakang);
			bantu->next=NULL;
			belakang=bantu;
	}
};

void tampil(){
bantu=depan;
	if(depan!=NULL){
		while(bantu!=NULL){
			cout<<bantu->info<<"  ";
			bantu=bantu->next;
		}
		cout<<endl;
	}
	else{
		cout<<"data kosong"<<endl;
	}

};

int main(){
int pil;
char lagi;
do{
	cout<<"program Single Linked List"<<endl;
	cout<<"1.  Tambah Depan"<<endl;
	cout<<"2.  Tambah Belakang"<<endl;
	cout<<"3.  Hapus Depan"<<endl;
	cout<<"4.  Hapus Belakang"<<endl;
	cout<<"5.  Tampil"<<endl;
	cout<<"Pilihan =";cin>>pil;
	switch(pil){
		case 1:tdep();break;
		case 2:tbel();break;
		case 3:hdep();break;
		case 4:hbel();break;
		case 5:tampil();break;
		default:cout<<"Error"<<endl;
	}
	cout<<"Lagi = ";cin>>lagi;
}
while((lagi=='y') || (lagi=='Y'));
}
