import java.io.*;

class make{
	public make(){
	}
	public static void main(String [] args){
		try{
		BufferedWriter x=new BufferedWriter(new FileWriter("satu.txt"));
		//FileOutputStream keluar=new FileOutputStream("satu.txt");
		x.write("Achmad Fauzi");
		x.close();
		}
		catch(Exception e){
			System.out.println("Gagal Membuat File");
		}
		finally{
			System.out.println("proses selesai");
		}
	}
}