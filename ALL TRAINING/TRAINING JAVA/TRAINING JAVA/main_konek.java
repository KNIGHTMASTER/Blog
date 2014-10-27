/**
 * @(#)main_konek.java
 *
 *
 * @author 
 * @version 1.00 2011/3/1
 */

import java.sql.*;
import java.util.Scanner;
public class main_konek {

    public static void main(String [] args) {
    	coba_koneksi x=new coba_koneksi();
    	x.konek("jdbc:mysql://localhost/simpeg/;","root","");
    }
    
    
}