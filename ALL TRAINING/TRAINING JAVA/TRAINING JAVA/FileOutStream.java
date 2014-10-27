import java.io.*; 
class FileOutStream { 
    public static void main(String[] args)throws IOException{ 
    	BufferedReader x=new BufferedReader (new InputStreamReader(System.in));
    	String masuk="";
    	System.out.print("masukkan nama file yang akan ditulis");masuk=x.readLine();
    	if(masuk==""){
    		System.out.println("nama file null");
    		System.exit(0);
    	}
    	String data;
    	FileWriter fout=null;    	
    	try{
    		fout=new FileWriter(masuk);
    		System.out.println("akhiri dengan STOP");
    		data=x.readLine();
    		while(!data.equals("STOP")){
    			fout.write(data);
    			data=x.readLine();
    		}
    	}
    	catch(FileNotFoundException e){
    		System.out.println("FILE IS NOT FOUND");
    	}
    	catch(IOException e){
    		System.out.println("System is error");
    	}
    	finally{
    		try{
    			if(fout!=null){
    				fout.close();
    			}
    		}
    		catch(IOException e){
    			System.out.print("ERROR");
    		}
    	}
    } 
} 
