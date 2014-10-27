class up implements Runnable{	
	public up(){
	}
	public void run(){
	int a=0,b=0,c=0;
		try{
			for(;;){			
				System.out.println(a+":"+b+":"+c);
				Thread.sleep(1);			
				c++;
					if(c>60){
						c=0;
						b++;
					}
					if(b>60){
						c=0;
						b=0;
						a++;
					}
//clear the console					
			}
		}
		catch(Exception e){
			System.err.println(e);
		}
	}
}

class timecounter{
	public static void main(String [] args){
		Thread instant1=new Thread(new up());
		instant1.start();
	}
}