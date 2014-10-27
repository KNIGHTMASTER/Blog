import java.io.*;

class fileins{
	public fileins(){
	}
	public static void main(String [] args){
		String file=args[0];
		try{
			FileInputStream x=new FileInputStream(file);
			int jumlahbyte=0;
			byte bufferdata[]=new byte[1024];
			jumlahbyte=x.available();
			while(jumlahbyte>0){
				int jumlahdibaca=x.read(bufferdata,0,bufferdata.length);
				System.out.write(bufferdata,0,jumlahdibaca);
				jumlahbyte=x.available();
			}
			x.close();
		}
		catch(Exception e){
			System.err.println(e);
		}		
	}
}