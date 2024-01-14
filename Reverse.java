import java.util.Scanner;

class Reverse{
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
			reverse = reminder + reverse * 10;
			temp = Math.floorDiv(temp, 10);
		}
		System.out.println("The reverse number: "+reverse);
	}
	
}

