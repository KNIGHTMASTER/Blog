import java.util.Random;

public class MatrixDeterminan{
	
	public static void main( String [] args ){
		int ordo = Integer.parseInt ( args[0] );
		System.out.println(  "Ordo = "+ ordo);
		int [][] matrix;
		if ( ordo == 2 ){
			matrix = new matrix[2][2];			
		}else if ( ordo == 3 ){
			matrix = new matrix[3][3];
		}else{
			System.out.println( "Can not get Determinan value from ordo "+ ordo );
		}
	}
	
}