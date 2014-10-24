import java.util.Random;

public class MatrixInvers2{

	public static void main( String [] args ){
		int ordo = Integer.parseInt( args[0] );
		double [][] matrix = createMatrix( ordo );
		showMatrix( matrix, ordo );
		double determinan = getDeterminan( matrix );
		System.out.println( "Determinan Is " +  determinan );
		double [][] invers = createInvers ( ordo, determinan, matrix );
		System.out.println( "Invers is" );
		showMatrix( invers, ordo );
	}
	
	static double[][] createMatrix( int ordo ){
		double [][] result = new double[ordo][ordo];
		for ( int a=0; a<ordo; a++ ){
			for ( int b=0; b<ordo; b++){
				result[a][b] = new Random().nextInt(9) + 1;
			}
		}
		return result;
	}
		
	static double getDeterminan( double [][] matrixOrdo2 ){
		double result = ( matrixOrdo2[0][0] * matrixOrdo2[1][1]) - ( matrixOrdo2[0][1] * matrixOrdo2[1][0] );
		return result;
	}
	
	static void showMatrix( double [][] matrix, int ordo){
		for ( int a=0; a<ordo; a++ ){
			for ( int b=0; b<ordo; b++ ){
				System.out.print( matrix[a][b] + " ");
			}
			System.out.println();
		}
	}
	
	static double[][] createInvers ( int ordo, double determinan, double[][] matrix ){
		double [][] result = new double[ordo][ordo];
		System.out.println( "Switching index position" );
		double temp = matrix[0][0];
		matrix[0][0] = matrix[1][1];
		matrix[1][1] = temp;				
		matrix[1][0] = -1 * matrix[1][0];
		matrix[0][1] = -1 * matrix[0][1];
		System.out.println( "After switching index position" );
		showMatrix( matrix, 2);
		double vector = 1/ determinan;
		for ( int a=0; a<ordo; a++ ){
			for ( int b=0; b<ordo; b++ ){
				result[a][b] = vector * matrix[a][b];
			}
		}
		return result;
	}
	
	
}