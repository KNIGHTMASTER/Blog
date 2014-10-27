import java.sql.*; 
import javax.swing.*; 
class DBTest{ 
 public static void main(String args[]){ 
  LoadDB ld = new LoadDB(); 
  ld.connectDB(); 
 } 
} 
class LoadDB{ 
 Connection conn; 
 public LoadDB(){ 
  try{ 
   Class.forName("com.mysql.jdbc.Driver").newInstance(); 
JOptionPane.showMessageDialog(null, "Driver is available","Driver",JOptionPane.INFORMATION_MESSAGE); 
   System.out.println("Driver is available"); 
  } catch(Exception e){ 
   System.err.println("Unable to load Driver"); 
   System.exit(1); 
  }  
 } 
 public void connectDB(){ 
  try{ 
   conn = 
DriverManager.getConnection("jdbc:mysql://localhost/mysql?user=root&password=root")
; 
   JOptionPane.showMessageDialog(null, "Connected Succesfully","Connections",JOptionPane.INFORMATION_MESSAGE); 
  } catch(SQLException e){ 
JOptionPane.showMessageDialog(null, 
e.getMessage(),"Connection",JOptionPane.INFORMATION_MESSAGE); 
   System.out.println(e.getMessage()); 
  } 
 } 
}