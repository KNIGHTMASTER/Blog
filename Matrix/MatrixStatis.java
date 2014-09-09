/*
	Created by Achmad Fauzi
	8 September 2014
*/
public class MatrixStatis{
	public static void main(String [] args){
		String matrix[][] = {{"a","b"}, {"a","b"}, {"a","b"}};
		for(int a=0; a<3; a++){
			for(int b=0; b<2; b++){
				System.out.print( matrix[a][b] + " ");
			}
			System.out.println();
		}
	}
}