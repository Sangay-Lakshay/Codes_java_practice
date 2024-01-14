import java.util.Scanner;

class OddEven{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		// lower limit will remain 0
		int l = 0;
		// input for upper limit
		System.out.println("Enter upper limit:");
		int u = sc.nextInt();
		// declare variables for sum of even numbers and odd numbers
		int even = 0;
		int odd = 0;
		// iterate the values from 0 till the user's upper limit
		for(int a = l; a <= u; a++){
			if(a % 2 == 0){
				even = even + a * a;
				// if condition is met then the number is squared and added to even

			}else{
				odd = odd + a * a;
				// when the number is odd then the number is squared and added to odd
			}
		}
		// both the sum is printed after the for loop is completed and we get the sum of square of even and odd numbers
		System.out.println("sum of square of even:"+even);
		System.out.println("sum of square of odd:"+odd);
	}

}