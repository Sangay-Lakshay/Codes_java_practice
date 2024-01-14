import java.util.Scanner;

class sum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the ID: ");
		long num = sc.nextLong();

		long temp = num;
		long even = 0;
		long odd = 0;

		while(temp > 0){
			long check = temp % 10;
			if( check % 2 == 0){
				even += check;
			}
			else{
				odd +=check;
			}
			temp = Math.floorDiv(temp, 10);
		}
		System.out.println("Sum of even: "+even);
		System.out.println("Sum of odd: "+odd);
	}
	
}