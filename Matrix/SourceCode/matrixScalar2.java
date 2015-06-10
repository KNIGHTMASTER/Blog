/*
	Created by Achmad Fauzi
	3 Oktober 2014
*/

import java.util.Scanner;

public class matrixScalar2{
	
	private static Scanner scan;
	
	public static void main( String [] args ){
		int bar1 = Integer.parseInt( args[0] );
		int kol1 = Integer.parseInt( args[1] );
		int bar2 = Integer.parseInt( args[2] );
		int kol2 = Integer.parseInt( args[3] );
		if ( kol1 != bar2 ){
			System.out.println ("Kolom matrix 1 != Baris matrix 2");
		}else{
			scan = new Scanner( System.in );
			System.out.println( "Input Matrix 1" );
			int [][] matrix1 = inputMatrix( bar1, kol1 );
			System.out.println( "Input Matrix 2" );
			int [][] matrix2 = inputMatrix( bar2, kol2 );
			System.out.println ( "Matrix 1:");
			displayMatrix( matrix1, bar1, kol1 );
			System.out.println ( "Matrix 2:");
			displayMatrix( matrix2, bar2, kol2 );
			int [][] result = processMultiply ( matrix1, matrix2, bar1, kol1, kol2 );
			System.out.println ( "Result Matrix Scalar :");
			displayMatrix( result, bar1, kol1 );
		}		
	}
	
	public static int [][] inputMatrix( int bar, int kol ){		
		int[][] matrix = new int[bar][kol];
		for (int a=0; a<bar; a++){
			for(int b=0; b<kol; b++){
				System.out.print("input index ["+a+","+b+"] =");
				matrix[a][b] = scan.nextInt();
			}
		}
		return matrix;
	}
	
	public static int [][] processMultiply( int [][] matrix1, int [][] matrix2, int bar, int kol, int kol2 ){
		int [][] result = new int[bar][kol];
		for ( int a=0; a<bar; a++ ){
			for ( int b=0; b<kol2; b++ ){
				for ( int c=0; c<kol; c++){
					result[a][b] = result[a][b] + matrix1[a][c] * matrix2[c][b];
				}
			}
		}
		return result;
	}
	
	public static void displayMatrix( int [][] matrix, int bar, int kol ){
		for(int a=0; a<bar; a++){
			for(int b=0; b<kol; b++){
				System.out.print(matrix[a][b] + " ");
			}
			System.out.println();
		}
	}
}