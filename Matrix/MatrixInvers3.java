import java.util.Random;

public class MatrixInvers3{

	public static void main ( String [] args ){
		int ordo = 3;
		double [][] matrix = createMatrix( ordo );
		showMatrix( ordo, ordo, matrix );
		System.out.println("=====================");
		double [][] matrixToCramer = createMatrixToCramer( ordo, matrix );
		showMatrix( ordo, 5,  matrixToCramer );
		System.out.println( "Determinant is : "+getDeterminan( 3, 5, matrixToCramer ));
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
	
	public static double[][] createMatrixToCramer( int ordo, double [][] matrix ){
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
		double result;
		double positiveTemp = 0.0;
		double negativeTemp = 0.0;				
		for ( int a=0; a<bar; a++ ){
			for ( int b=0; b<kol; b++ ){
				if ( b<=2 ){
					//Grabbing positive component
					if ( a<=b ){
						System.out.println("POSITIVE TEMP = "+ matrix[a][b]);
						if ( positiveTemp <= 0.0 ){
							positiveTemp += matrix[a][b];							
						}else{
							positiveTemp *= matrix[a][b];
						}
					}
					//Grabbing negative component
					if ( a>=b ){
					System.out.println("NEGATIVE TEMP = "+ matrix[a][b]);
						if ( positiveTemp <= 0.0 ){
							negativeTemp += matrix[a][b];
						}else{
							negativeTemp *= matrix[a][b];
						}
					}
				}
			}
		}
		result = positiveTemp - negativeTemp;
		return result;
	}

}
