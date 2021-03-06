/*
	Created by Achmad Fauzi
	8 September 2014
*/


import java.util.Random;

public class MatrixIdentitas{
		private static int [][]matrix;
	
	public static void main(String [] args){
		int ordo = Integer.parseInt(args[0]);
		matrix = new int[ordo][ordo];
		createIdentityMatrix(ordo , ordo);
		displayMatrix(ordo , ordo);
	}
	
	public static void createIdentityMatrix(int bar, int kol){
		for(int a=0; a<bar; a++){
			for(int b=0; b<kol; b++){
				if( a == b ){
					matrix[a][b] = 1;
				}else{
					matrix[a][b] = new Random().nextInt(9) + 1;
				}
			}
		}
	}
	
	public static void displayMatrix(int bar, int kol){
		for(int a=0; a<bar; a++){
			for(int b=0; b<bar; b++){
				System.out.print(matrix[a][b] + " ");
			}
			System.out.println();
		}
	}	
	

}