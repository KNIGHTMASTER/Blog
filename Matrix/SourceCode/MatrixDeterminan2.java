import java.util.Random;

public class MatrixDeterminan2{

	public static void main( String [] args ){
		int ordo = Integer.parseInt( args[0] );
		int[][] matrix = createMatrix( ordo );
		showMatrix( matrix, 2);
		System.out.println( "Determinan Is " + getDeterminan( matrix ) );
	}
	
	static int[][] createMatrix( int ordo ){
		int [][] result = new int[ordo][ordo];
		for ( int a=0; a<ordo; a++ ){
			for ( int b=0; b<ordo; b++){
				result[a][b] = new Random().nextInt(9) + 1;
			}
		}
		return result;
	}
		
	static int getDeterminan( int[][] matrixOrdo2 ){
		int result = ( matrixOrdo2[0][0] * matrixOrdo2[1][1]) - ( matrixOrdo2[0][1] * matrixOrdo2[1][0] );
		return result;
	}
	
	static void showMatrix( int [][] matrix, int ordo){
		for ( int a=0; a<ordo; a++ ){
			for ( int b=0; b<ordo; b++ ){
				System.out.print( matrix[a][b] + " ");
			}
			System.out.println();
		}
	}
	
}