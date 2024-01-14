import java.util.Scanner;

class Palindrome{
	public static void main(String[] args){
		int num; 
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your number: ");
		num = sc.nextInt();

		int temp = num;
		int reminder = 0;
		int reverse = 0;

		while(temp > 0){
			reminder = temp % 10;
			System.out.println(reminder);
			reverse = reminder + reverse * 10;
			temp = Math.floorDiv(temp, 10);
		}
		if (num == reverse){
			System.out.println("The number is a palindrome");
		}
		else{
			System.out.println("The number is not a palindrome");
		}
	}
	
}
