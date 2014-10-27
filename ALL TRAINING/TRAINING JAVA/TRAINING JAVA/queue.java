/**
 * @(#)queue.java
 *
 *
 * @author 
 * @version 1.00 2011/3/1
 */


public class queue {
int [] data=new data[100];
int top =0;
    public queue() {
    }
    
    public void enqueue(int data){
 			System.out.print("masukkan data = ");nilai=x.nextInt();
 			top++;
 			data[top]=nilai;
    	}
    	public int dequeue(){
    		int keluar=data[top];
    		top--;    		
    		return keluar;
    	}
}