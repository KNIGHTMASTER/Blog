import java.io.*;

class masuk{
	public masuk(){
	}
	public static void main(String [] args){
		try{
		BufferedWriter out=new BufferedWriter(new FileWriter("wan.txt"));
		
			out.write("Nama Saya adalah = Achmad Fauzi\nakjdshads ioads\n\nakjdshads ioads\n\nakjdshads ioads\n\nakjdshads ioads\n\nakjdshads ioads\n\nakjdshads ioads\n\nakjdshads ioads\n\nakjdshads ioads\n\nakjdshads ioads\n");
			out.close();
		}
		catch(Exception E){
			System.err.println(E);
		}
		finally{
			System.out.println("Program Finished");
		}
		
	}
}