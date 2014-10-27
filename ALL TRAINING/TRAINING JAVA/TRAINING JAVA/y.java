import java.sql.*;

class y{
	public static void main(String [] args){
		Connection konek=null;
		Statement st=null;
		ResultSet rs=null;
		String query="";
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is found");
			konek=DriverManager.getConnection("jdbc:mysql://localhost/simpeg?;","root","");
			System.out.println("koneksi ok");
			st=konek.createStatement();
			System.out.println("Statement OK");
			rs=st.executeQuery("select * from pegawai");
		}
		catch(Exception e){
		System.out.println("ERROR");
		}
	}
}