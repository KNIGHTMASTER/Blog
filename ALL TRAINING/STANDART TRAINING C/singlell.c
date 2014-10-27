#include <stdio.h>
#include <stdlib.h>

typedef struct data{
   int info;
   struct data *next;
}data;

data *new,*help,*front,*back;

void tdep(){
   new=(data*) malloc (sizeof(data));
      if(new!=NULL){
         printf("masukkan info = ");scanf("%d",&new->info);
            if(front==NULL){
               front=back=new;
            }
            else{
               new->next=front;
               front=new;
            }
      }
}

void tbel(){
   new=(data*)malloc(sizeof(data));
      if(new!=NULL){
         printf("Masukkan data = ");scanf("%d",&new->info);
            if(front==NULL){
               front=back=new;
            }
            else{
               back->next=new;
               back=new;
            }
      }
}

void hdep(){
   
}

void hbel(){
}

void show(){
   if(front==NULL){
      printf("data kosong\n");
   }
   else{
      help=front;
         while(help!=NULL){
            printf("%d-->",help->info);
            help=help->next;
         }
            printf("NULL\n");
   }
}

void primary(){
int pil;
char lagi;
do{
	printf("1.  Tambah depan\n");
	printf("2.  Tambah belakang\n");
	printf("3.  hapus depan\n");		
	printf("4.  hapus belakang\n");		
	printf("5.  show\n");
   printf("pilihan = ");scanf("%d",&pil);
      switch(pil){
         case 1:tdep();break;
         case 2:tbel();break;
         case 3:hdep();break;
         case 4:hbel();break;
         case 5:show();break;         
         default:printf("error\n");
      }
     printf("lagi  = ");scanf("%c",&lagi);scanf("%c",&lagi);
}
   while(lagi=='y' || lagi=='Y');
}

int main(){
   primary();
	return (0);
}
