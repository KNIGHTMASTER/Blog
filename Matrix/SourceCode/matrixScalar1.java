/*
	Created by Achmad Fauzi
	3 Oktober 2014
*/

public class matrixScalar1{
	
	public static void main( String [] args ){
		int value = Integer.parseInt( args[0] );
		int [][] matrix = { {1,2,3}, {1,2,3} };
		processMultiply( value, matrix );
		displayMatrix( matrix );
	}
	
	public static void processMultiply( int value, int [][] matrix){		
		for (int a=0; a<2; a++){
			for(int b=0; b<3; b++){
				matrix[a][b] = matrix[a][b] * value;
			}
		}
	}
	
	public static void displayMatrix( int [][] matrix ){
		for(int a=0; a<2; a++){
			for(int b=0; b<3; b++){
				System.out.print(matrix[a][b] + " ");
			}
			System.out.println();
		}
	}
}