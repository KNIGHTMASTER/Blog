import java.util.Random;

/*
	Created by Achmad Fauzi
	4 Oktober 2014
*/

public class MatrixSegitigaAtas{
	
	public static void main( String [] args ){
		int ordo = Integer.parseInt( args[0] );
		int [][] matrix = createMatrix( ordo );
		displayMatrix( matrix, ordo );
	}
	
	public static int[][] createMatrix( int ordo ){
		int [][] result = new int[ordo][ordo];
		for(int a=0; a<ordo; a++){
			for(int b=0; b<ordo; b++){
				if ( ( a<b ) ){
					result[a][b] = 0;
				}else{
					result[a][b] = new Random().nextInt(9) + 1;
				}
			}
		}
		return result;
	}
	
	public static void displayMatrix( int [][] matrix, int ordo ){
		for(int a=0; a<ordo; a++){
			for(int b=0; b<ordo; b++){
				System.out.print(matrix[a][b] + " ");
			}
			System.out.println();
		}
	}
}