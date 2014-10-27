class cobathread extends Thread{
	public cobathread(){
	}
	public void run(){
		try{
			for(int a=1;a<=5;a++){
				System.out.println("hello");
				Thread.sleep(4000);
			}			
		}
		catch(Exception e){
			System.err.println(e);
		}
	}
}
class cobarunnable implements Runnable{
	public cobarunnable(){
	}
	public void run(){
		try{
			for(int a=1;a<=5;a++){
				System.out.println("apa kabar");
				Thread.sleep(1000);
			}			
		}
		catch(Exception e){
			System.err.println(e);
		}
	}
}

class belajarthread{
	public static void main(String [] args){
		Thread instant1=new Thread(new cobathread());
		Thread instant2=new Thread(new cobarunnable());
		instant1.start();
		try{
			Thread.sleep(1000);
			System.out.println("move to other thread");
		}
		catch(Exception e){
			System.err.println(e);
		}		
		instant2.start();
	}
}