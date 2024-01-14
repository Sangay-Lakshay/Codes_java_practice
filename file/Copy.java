import java.io.*;
import java.util.Scanner;

class Copy{
	public static void main(String[] args){
		try{
			Scanner sc = new Scanner(System.in);

			System.out.print("Enter size: ");
			int s = sc.nextInt();

			int arr[] = new int[s];

			for(int i = 0; i < s; i++){
				System.out.print("Enter number: ");
				arr[i] = sc.nextInt();
				
			}

			File file = new File("even.txt");

			PrintWriter in = new PrintWriter(file);
			for(int i = 0; i < s; i++){
				if(arr[i] % 2 == 0){
					in.println(arr[i]);
				}
			}
			in.close();
		}catch(IOException e) {
     		System.out.println("An error occurred.");
     	}
	}
}