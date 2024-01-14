import java.util.Scanner;

class Array{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Eter the row of the array:");
		int row = sc.nextInt();

		System.out.println("Eter the column of the array:");
		int col = sc.nextInt();

		int[][] a = new int[row][col];

		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
				System.out.println("Enter the element for row "+ i + " and column "+ j +":");
				a[i][j] = sc.nextInt();
			}
			
		}
		System.out.println("Your array is:");
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
				System.out.print(" " + a[i][j]);
			}
		System.out.println();
		}
	}
}