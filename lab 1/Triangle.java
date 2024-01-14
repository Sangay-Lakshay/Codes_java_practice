import java.util.Scanner;

class Triangle{
	public static void main(String[] arg){
		// varibles for three sides for the traingle
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		// take user input 
		System.out.println("Enter 1st triangle side: ");
		a = sc.nextInt();
		System.out.println("Enter 2nd triangle side: ");
		b = sc.nextInt();
		System.out.println("Enter 3rd triangle side: ");
		c = sc.nextInt();
		// call method and print the output
		System.out.println(is_equilateral(a, b, c));
	}
	// method to check if the triangle is equilateral or not 
	// it took me a while to find and understand this 
	public static boolean is_equilateral(int a, int b, int c){
		// we set the method to boolean so the output will be in boolean.
		// for a trangle to be equilateral all the sides should be equal
		// if the condition is fulfilled then it will give true, if not false
		return a == b && b == c;

	}
	
}