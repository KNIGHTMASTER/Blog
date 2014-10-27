class labelwalk extends Thread{
	public static void main(String [] args){
		try{
			for(int a=0;a<50;a++){
				System.out.print("halo");
			}
		}
		catch(Exception e){
			System.err.println(e);
		}
	}
}