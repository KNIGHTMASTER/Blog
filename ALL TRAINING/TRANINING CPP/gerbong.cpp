#include <iostream.h>
#include <stdlib.h>

typedef struct gerbong{
	int data;
	struct gerbong *next;
}gerbong;

gerbong *baru, *kepala, *ekor, *bantu;

void tdep(){
	baru=new (gerbong);
		if(baru!=NULL){
			cout<<"masukkan data = ";cin>>baru->data;
				if(kepala==NULL){
					kepala=ekor=baru;
					kepala->next=NULL;
				}
				else{
					baru->next=kepala;
					kepala=baru;
				}
		}
		else{
			cout<<"pemesanan gerbong gagal"<<endl;
		}
};
void tbel(){
	baru=new (gerbong);
		if(baru!=NULL){
			bantu=kepala;
				while(bantu!=NULL){
					bantu=bantu->next;
				}
				cout<<"masukkan data = ";cin>>baru->data;
				ekor->next=baru;
				ekor=baru;
				ekor->next=NULL;
		}
		else{
			cout<<"pemesanan gerbong gagal"<<endl;
		}

};

void hdep(){
	if(kepala==NULL){
		cout<<"data kosong"<<endl;
	}
	else if(kepala==ekor){
		free(kepala);
      kepala=NULL;
	}
	else{
		bantu=kepala;
		kepala=kepala->next;
		free(bantu);
	}
};

void hbel(){
};

void tampil(){
	if(kepala==NULL){
		cout<<"data kosong"<<endl;
	}
	else{
		bantu=kepala;
			while(bantu!=NULL){
				cout<<bantu->data<<"-->";
				bantu=bantu->next;
			}
			cout<<"NULL"<<endl;
	}
};

int main(){
int choice;
char again;
do{
	cout<<"program single linked list"<<endl;
	cout<<"1.  tdep"<<endl;
	cout<<"2.  tbel"<<endl;
	cout<<"3.  hdep"<<endl;
	cout<<"4.  hbel"<<endl;
	cout<<"5.  tampil"<<endl;
	cout<<"masukkan pilihan = ";cin>>choice;
		switch(choice){
			case 1:tdep();break;
			case 2:tbel();break;
			case 3:hdep();break;
			case 4:hbel();break;
			case 5:tampil();break;
			default : cout<<"pilihan anda tidak ada dalam list"<<endl;
		}
		cout<<"apakah ingin proses lagi = ";cin>>again;
	}
	while(again=='Y' || again=='y');
}