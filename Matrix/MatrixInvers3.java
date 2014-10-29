import java.util.Random;

public class MatrixInvers3{

	public static void main ( String [] args ){
		int ordo = 3;
		double [][] matrix = createMatrix( ordo );
		showMatrix( ordo, ordo, matrix );
		System.out.println("=====================");
		double [][] matrixToAdjunctionCramer = createMatrixToAdjunctionCramer( ordo, matrix );		
		showMatrix( ordo, 5,  matrixToAdjunctionCramer );
		System.out.println("=====================");
		double determinan = getDeterminan( 3, 5, matrixToAdjunctionCramer );
		System.out.println( "Determinant is : "+ determinan );
		double[][] transposedMatrix = createTransposeMatrix( matrix, ordo );
		System.out.println("TRANSPOSE MATRIX=====================");
		showMatrix( ordo, ordo, transposedMatrix );
		
		double [][] adjMatrix = getAdjunction( transposedMatrix, ordo );
		System.out.println("ADJ MATRIX=====================");
		showMatrix( ordo, ordo, adjMatrix );
		double[][] inversMatrix = getInvers( adjMatrix, determinan, 	ordo );
		System.out.println("INVERS MATRIX=====================");
		showMatrix( ordo, ordo, inversMatrix );
	}
	
	public static double [][] createMatrix( int ordo ){
		double [][] result = new double[ordo][ordo];
		for ( int a=0; a<ordo; a++ ){
			for ( int b=0; b<ordo; b++ ){
				result[a][b] = new Random().nextInt(9)+1;
			}
		}
		return result;
	}
	
	public static void showMatrix( int bar, int kol, double [][] matrix ){
		for( int a=0; a<bar; a++ ){
			for( int b=0; b<kol; b++ ){
				System.out.print( matrix[a][b] + " ");
			}
			System.out.println("");
		}
	}
	
	public static double[][] createMatrixToAdjunctionCramer( int ordo, double [][] matrix ){
		int newOrdo = ordo+2;
		double[][] result = new double[ordo][newOrdo];
		for ( int a=0; a<ordo; a++ ){
			for ( int b=0; b<newOrdo; b++ ){
				if( b < 3 ){
					result[a][b] = matrix[a][b];
				}else{
					result[a][b] = matrix[a][b-3];					
				}
			}
		}
		return result;
	}
	
	public static double getDeterminan( int bar, int kol, double[][] matrix ){
		double result = 0.0;		
		result = ( ( matrix[0][0] * matrix[1][1] * matrix[2][2] ) + 
					( matrix[0][1] * matrix[1][2] * matrix[2][3] ) + 
					( matrix[0][2] * matrix[1][3] * matrix[2][4] ) ) - 
				 ( ( matrix[2][0] * matrix[1][1] * matrix[0][2] ) +
					( matrix[2][1] * matrix[1][2] * matrix[0][3] ) +
					( matrix[2][2] * matrix[1][3] * matrix[0][4] ) );				
		return result;
	}

	public static double [][] createTransposeMatrix( double[][] matrix, int ordo ){
		double [][] result = new double[ordo][ordo];
		for ( int a=0; a<ordo; a++ ){
			for ( int b=0; b<ordo; b++ ){
				result[a][b] = matrix[b][a];
			}
		}
		return result;
	}
	public static double [][] getInvers( double[][] adjMatrix, double determinan, int ordo ){
		double multiplier = 1/determinan;
		double[][] result = new double[ordo][ordo];
		for ( int a=0; a<ordo; a++ ){
			for ( int b=0; b<ordo; b++ ){
				result[a][b] = multiplier * adjMatrix[a][b];
			}
		}
		return result;
	}
	
	public static double [][] getAdjunction( double [][] transposedMatrix, int ordo ){
		double[][] adjunction = new double[ordo][ordo];
		adjunction[0][0]=transposedMatrix[1][1]*transposedMatrix[2][2]-(transposedMatrix[2][1]*transposedMatrix[1][2]);
		adjunction[0][1]=(-1)*(transposedMatrix[1][0]*transposedMatrix[2][2]-(transposedMatrix[2][0]*transposedMatrix[1][2]));
		adjunction[0][2]=transposedMatrix[1][0]*transposedMatrix[2][1]-(transposedMatrix[2][0]*transposedMatrix[1][1]);
		
		adjunction[1][0]=(-1)*(transposedMatrix[0][1]*transposedMatrix[2][2]-transposedMatrix[2][1]*transposedMatrix[0][2]);
		adjunction[1][1]=transposedMatrix[0][0]*transposedMatrix[2][2]-transposedMatrix[2][0]*transposedMatrix[0][2];
		adjunction[1][2]=(-1)*(transposedMatrix[0][0]*transposedMatrix[2][1]-transposedMatrix[2][0]*transposedMatrix[0][1]);

		adjunction[2][0]=transposedMatrix[0][1]*transposedMatrix[1][2]-transposedMatrix[1][1]*transposedMatrix[0][2];
		adjunction[2][1]=(-1)*(transposedMatrix[0][0]*transposedMatrix[1][2]-transposedMatrix[1][0]*transposedMatrix[0][2]);
		adjunction[2][2]=transposedMatrix[0][0]*transposedMatrix[1][1]-transposedMatrix[1][0]*transposedMatrix[0][1];
		
		return adjunction;
	}
	
}
