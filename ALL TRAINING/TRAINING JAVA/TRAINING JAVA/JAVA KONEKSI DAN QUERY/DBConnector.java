/*  File name: DBConnector.java 
 Koneksi dengan basis data 
*/ 
 
import java.sql.Connection; 
import java.sql.Statement; 
import java.sql.DriverManager; 
import java.sql.ResultSet; 
import java.sql.ResultSetMetaData; 
import java.sql.SQLException; 
import javax.swing.JOptionPane; 
class DBConnector { 
 int colCount; 
 Connection db; 
 Statement stat; 
 String currentURL; 
 String password; 
  
 public DBConnector(String url, String user, String passwd){ 
  if (url.equals(currentURL)){ 
   return; 
  } 
  this.password=passwd;  
  closeDB(); 
  connectDB(url,user); 
  currentURL = url; 
 } 
 public void connectDB(String url,String user){ 
  try { 
   Class.forName("com.mysql.jdbc.Driver"); 
   db = DriverManager.getConnection(url,user,this.password); 
   stat = db.createStatement(); 
  } catch (ClassNotFoundException cnf){ 
   JOptionPane.showConfirmDialog(null,"Driver Java:MySQL tidak ditemukan","Driver Error", JOptionPane.WARNING_MESSAGE); 
  } catch (SQLException se){ 
JOptionPane.showConfirmDialog(null,"Database tidak bisa ditemukan","Database Error", JOptionPane.WARNING_MESSAGE); 
  } 
 } 
 public void closeDB(){ 
  try { 
   if(stat!=null){stat.close();} 
   if(db!=null){db.close();} 
  } catch (Exception e){ 
   JOptionPane.showConfirmDialog(null,"Koneksi tidak bisa diputus","Closing Error", JOptionPane.WARNING_MESSAGE); 
  } 
 } 
  
 public void setIQuery(String query){ 
  try{ 
   stat.executeUpdate(query); 
  } catch (SQLException sqle){ 
JOptionPane.showConfirmDialog(null,sqle.getMessage(),"Query Error", JOptionPane.WARNING_MESSAGE); 
  } 
 } 
 public Object[] setSQuery(String query){ 
  Object record[]=null; 
 
  try{ 
   ResultSet rs = stat.executeQuery(query); 
   ResultSetMetaData md = rs.getMetaData(); 
    
   colCount = md.getColumnCount(); 
    
   while(rs.next()){ 
    record = new String[colCount]; 
    for (int i=0; i<colCount;i++){ 
     record[i]=rs.getString(i+1); 
    } 
   } 
  } catch (Exception e){ 
  } 
  return record; 
 } 
}