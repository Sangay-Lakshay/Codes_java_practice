import java.util.Scanner;

class Compare{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter num 1:");
		int num1 = sc.nextInt();

		System.out.println("Enter num 2:");
		int num2 = sc.nextInt();

		int result = Integer.compare(num1, num2);

		if(result == 0){
			System.out.println("The num1 is equal to num2");
		}else if(result < 0){
			System.out.println("The num1 is less to num2");
		}else{
			System.out.println("The num1 is greater to num2");
		}

	}
}