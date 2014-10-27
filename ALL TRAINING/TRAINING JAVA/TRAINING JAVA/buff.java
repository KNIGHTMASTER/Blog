import java.io.*;

class buff{
	public static void main(String [] args)throws IOException{
		BufferedReader x=new BufferedReader (new InputStreamReader(System.in));
		String input="";
		System.out.print("Masukkan nama file yang akan dibaca beserta ekstensinya = ");input=x.readLine();
		if(input==""){
			System.out.println("NAMA FILE BELUM DIINPUT");
		}
		byte data;
		FileInputStream fin=null;
		try{
			fin=new FileInputStream(input);
			do{
				data=(byte)fin.read();
				System.out.print((char)data);
			}
			while(data!=-1);
		}
		catch(FileNotFoundException ex){
			System.out.println("Data tidak ditemukan");
		}
		catch(IOException e){
			System.out.println("EXCEPTION UNKNOWN / System is being ERROR");
		}
		finally{
			if(fin!=null){
				try{
					fin.close();
				}
				catch(IOException e){
					System.out.println("File can't Be closed");
				}				
			}
		}
	}
}
