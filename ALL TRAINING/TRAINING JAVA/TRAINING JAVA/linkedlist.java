import java.util.Scanner;
class node{
	int data;
	node next;
}

class linkedlist{
	node head;
	node tail;
	
	boolean isEmpty(){
		return (head==null);
	}
	void addFirst(node input){
		if(isEmpty()){
			head=input;
			tail=input;
			System.out.print("HEAD= "+head.data);
		}
		else{
			input.next=head;
			head=input;
			System.out.print("HEAD= "+head.data);			
		}
	}
	void addLast(node input){
		if(isEmpty()){
			head=input;
			tail=input;
		}
		else{
			tail.next=input;
			tail=input;
			System.out.print("TAIL= "+tail.data);			
		}
	}
	void viewNode(){
		node temp;
		temp=head;
		while(temp!=null){
			System.out.print(temp.data+"==>");
			temp=temp.next;
		}
		   System.out.print("NULL==>");
	}
	void remFirst(){
      node help;
      help=head;	   
	   if(head==null){
	      System.out.println("Data Is Empty");
	   }
	   else if(head==tail){
	      head=tail=null;
	   }
	   else{
	      head=head.next;
	      help=null;
	   }
	}
	void remLast(){
	   node help;
	   help=head;
	   if(head==null){
	      System.out.println("data is Empty");
	   }
	   else if(head==tail){
	      head=tail=null;
	   }
	   else{
         while(help.next!=tail){
            help=help.next;
         }
         help.next=null;
         tail=help;
         help=null;
	   }
	}	
	void insertAfter(int key, node tupel){
	   node help=head;
	   while(help.next!=null){
	      if(help.data==key){
            tupel.next=help.next;
            help.next=tupel;            
            System.out.println("Insert Okay");
            break;            
	      }
	      else{
   	      help=help.next;
	      }	      
	   }
	}
	void insertBefore(int key, node tupel){
	   node help=head;
      do{
         if(help.data==key){
            tupel.next=help.next;
            help.next=tupel;            
            System.out.println("Insert Okay");
            System.exit(0);
            break;            
         }
         help=help.next;
      }
      while(help!=null);
	}	
	public static void main(String [] args){
		Scanner x=new Scanner(System.in);
		int choose,masuk;
		String again=null;		
		linkedlist sll=new linkedlist();
		do{
		node nod=new node();
		System.out.println("1.  ADD FIRST");
		System.out.println("2.  ADD LAST");
		System.out.println("3.  REMOVE FIRST");		
		System.out.println("4.  REMOVE LAST");
		System.out.println("5.  INSERT AFTER");
		System.out.println("6.  INSERT BEFORE");														
		System.out.println("7.  VIEW");
		System.out.println("CHOOSE = ");choose=x.nextInt();
		int key=0;
		switch(choose){		   
			case 1:	System.out.print("input = ");masuk=x.nextInt();
					nod.data=masuk;
					sll.addFirst(nod);
					break;
			case 2:	System.out.print("input = ");masuk=x.nextInt();
					nod.data=masuk;
					sll.addLast(nod);
					break;
			case 3:	sll.remFirst();
					break;
			case 4:	sll.remLast();
					break;															
			case 5:	System.out.print("masukkan key = ");key=x.nextInt();
         			System.out.print("masukkan data = ");masuk=x.nextInt();
			   		nod.data=masuk;
   					sll.insertAfter(key, nod);
					break;
			case 6:	System.out.print("masukkan key = ");key=x.nextInt();
         			System.out.print("masukkan data = ");masuk=x.nextInt();
			   		nod.data=masuk;
   					sll.insertBefore(key, nod);
					break;										
			case 7: sll.viewNode();
					break;
			default: System.err.println("ERROR !!!");
		}
			System.out.print("\nagain = y || n ?");again=x.nextLine();again=x.nextLine();
		}
		while(again.equals("Y") || again.equals("y"));
	}
}
