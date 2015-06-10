import java.util.Scanner;

public class MatrixDinamis{	

	private static Scanner scan;
	
	private static int [][]matrix;
	
	public static void main(String [] args){
		int bar = Integer.parseInt(args[0]);
		int kol = Integer.parseInt(args[1]);
		/*System.out.println("Baris = "+bar);
		System.out.println("Kolom = "+kol);*/
		matrix = new int[bar][kol];
		inputValueMatrix(bar, kol);
		displayMatrix(bar, kol);
	}
	
	public static void inputValueMatrix(int bar, int kol){
		scan = new Scanner(System.in);
		for (int a=0; a<bar; a++){
			for(int b=0; b<kol; b++){
				System.out.print("input index ["+a+","+b+"] =");
				matrix[a][b] = scan.nextInt();
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