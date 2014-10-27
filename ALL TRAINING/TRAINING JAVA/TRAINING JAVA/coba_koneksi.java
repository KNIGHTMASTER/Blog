/**
 * @(#)coba_koneksi.java
 *
 *
 * @author 
 * @version 1.00 2011/2/17
 */
import java.sql.*;
import java.util.Scanner;

class coba_koneksi{

	public static void main(String [] args){
			Statement state=null;
	ResultSet rs=null;
	Connection conn;
	String query="";
			try{
				Class.forName("com.mysql.jdbc.Driver");				
				System.out.println("Driver is found");
				}
				catch(Exception e){
					System.err.println("Driver not found");
				}
				try{
					conn=DriverManager.getConnection("jdbc:mysql://localhost/simpeg?;","root","");
					state=conn.createStatement();
					System.out.println("Koneksi berhasil");
					}
					catch(Exception e){
						System.out.print("Error koneksi ke database="+e);
					}
					
					try{
						query="SELECT * FROM barang";
						rs=state.executeQuery(query);
						}
						catch(Exception e){
							System.out.println("Ekekusi query error = "+e);
						}
		}
			}
	