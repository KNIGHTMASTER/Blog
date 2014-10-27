import java.util.Scanner;

class setQueue{
	public Scanner dataIn=new Scanner(System.in);
	int [] data;
	int head=0,tail=-1,N=0;
	public setQueue(){
		setPanjangAntrian();
	}
	public void setPanjangAntrian(){
		System.out.print("masukkan panjang antrian =");N=dataIn.nextInt();
		data=new int[N];
	}	
	public void Reset(){
		head=0;
		tail=-1;
	}
	public void Enqueue(){
		if(tail<N-1){
			tail++;
			System.out.print("masukkan nilai = ");data[tail]=dataIn.nextInt();
		}
		else{
			System.out.println("Antrian Penuh");
		}
	}
	public int Dequeue(){		
		int temp=0;
		if(head<tail+1){
			temp=data[head];
			head++;
			if(head==N){
				head=0;
				tail=-1;
			}
		}			
		else{
			System.out.println("Antrian Kosong");
		}
		return temp;
	}
	public void tampilAntrian(){
		System.out.println("tail = "+tail);
		System.out.println("head = "+head);
		for(int a=head;a<=tail;a++){
			System.out.println(data[a]);
		}
		System.out.println();
	}
	public void cekStatistik(){
		double total=0.0;
		double average=0;
		int max=data[head];
		int min=data[head];
		for(int a=head;a<=tail;a++){
			if(data[a]>max){
				max=data[a];
			}
			if(data[a]<min){
				min=data[a];
			}
			total+=data[a];
		}				
		average=total/((tail+1)-head);
		System.out.println("Total Data= "+total);
		System.out.println("Nilai Max= "+max);
		System.out.println("Nilai Min= "+min);
		System.out.println("Nilai Average= "+average);		
	}
}
class Queue{
	public static void main(String [] args){
		Scanner x=new Scanner(System.in);
		setQueue antrian=new setQueue();
		//System.gc();
		int pil=0;
		String lagi="";
		do{
			System.out.println("1.  Enqueue");
			System.out.println("2.  Dequeue");
			System.out.println("3.  Tampil Queue");
			System.out.println("4.  Cek Statistik");
			System.out.print("masukkan pilihan = ");pil=x.nextInt();
			switch (pil){
				case 1:antrian.Enqueue();break;
				case 2:antrian.Dequeue();break;
				case 3:antrian.tampilAntrian();break;
				case 4:antrian.cekStatistik();break;
				default:System.out.println("Out Of Range");
			}
			System.out.print("Lagi = ");lagi=x.nextLine();lagi=x.nextLine();
		}
		while(lagi.equals("Y")||lagi.equals("y"));		
	}
}