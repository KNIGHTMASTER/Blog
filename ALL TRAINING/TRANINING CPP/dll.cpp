#include <iostream.h>
#include <stdlib.h>

typedef struct node{
	int data;
	struct node *next;
	struct node *prev;
}node;

node *help, *head, *tail, *baru;

void addFirst(){
	baru=new (node);
		if(baru!=NULL){
			cout<<"input data = ";cin>>baru->data;
			if(head==NULL){
				head=tail=baru;
				head->next=NULL;
				head->prev=NULL;
			}
			else{
				baru->next=head;
				head->prev=baru;
				head=tail=baru;
			}
		}
		else{
			cout<<"tidak mengakses memory";
		}
}
void addLast(){
}
void removeFirst(){
	if(head==NULL){
		cout<<"kosong"<<endl;
	}
	else if(head==tail){
		free(head);
		head=tail=NULL;
	}
	else{
		help=head;
		head=head->next;
		free(help);
	}
}
void viewFirst(){
	if(head==NULL){
		cout<<"empty node"<<endl;
	}
	else{
		help=head;
			while(help!=NULL){
				cout<<help->data<<"-->";
				help=help->next;
			}
			cout<<"NULL"<<endl;
	}
}
int main(){
	int pil, again;
	do{
		cout<<"program linkedlist menggunakan c++"<<endl;
		cout<<"1. addFirst"<<endl;
		cout<<"2. addLast"<<endl;
		cout<<"3. removeFirst"<<endl;
		cout<<"4. viewFirst"<<endl;
		cout<<"choose = ";cin>>pil;
			switch(pil){
				case 1:addFirst();break;
				case 2:addLast();break;
				case 3:removeFirst();break;
				case 4:viewFirst();break;
				default :cout<<"wrong";
			}
		cout<<"again = ";cin>>again;
	}
	while(again==1);
}