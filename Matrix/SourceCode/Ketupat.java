public class Ketupat{

	public static void main( String [] args ){
		int angka = Integer.parseInt( args[0] );
		String [][] matrixKetupat = createMatrixSegitiga( angka );
		
	}
	
	public static String [][] createMatrixSegitiga(int length){
		String [][] result = new String[length][length];
		for (int a=0; a<length; a++){
			for(int b=length; b>=0; b--){
				result[a][b] = "*";
			}
		}
		return result;
	}
	
	public void displayMatrixegitiga(String[][] matrix, int angka){
		for (int a=0; a<angka; a++){
			for(int b=0; b<angka; b++){
				System.out.print(matrix[a][b]+" ");
			}
			System.out.println();
		}
	}
}