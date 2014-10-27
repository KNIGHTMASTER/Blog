import java.sql.*;


class x{
	public static void main(String [] args){
	Statement st=null;
	String query="";
	Connection koneksi=null;
	ResultSet rs=null;
	try{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver is found");
		
		koneksi=DriverManager.getConnection("jdbc:mysql://localhost/simpeg?;","root","");
		System.out.println("Connection has been built");
		
		st=koneksi.createStatement();
		System.out.println("Statement has been built");
		
		rs=st.executeQuery("Select * from pegawai");
		System.out.println("Statement has been executed!!!");
		
		query="insert into barang values(1,1,1,1)";
		
		int hasil=st.executeUpdate(query);
		if(hasil==1){
			System.out.println("insert ok");
		}
		else{
		System.out.println("gagal insert");
		}
	}
	catch(Exception e){
		System.out.println("System error karena" + e);
	}
		
	}
}