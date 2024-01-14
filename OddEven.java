import java.util.Scanner;

class OddEven{
	public static void main(String[] args){
		/*
		Without the user input, the variable is system defined

		int a;
		int even = 0;
		int odd= 0;
		for(a = 0; a <= 20; a ++){
			if(a % 2 == 0){
				even = even + a;

			}else{
				odd = odd + a;
			}
		}
		System.out.println("sum of even:"+even);
		System.out.println("eum of odd:"+odd);*/

		// the variable is user defined 

		Scanner sc = new Scanner(System.in);
		// input for lower limit
		System.out.println("Enter lower limit:");
		int l = sc.nextInt();
		// input for upper limit
		System.out.println("Enter upper limit:");
		int u = sc.nextInt();
		
		int even = 0;
		int odd = 0;
		for(int a = l; a <= u; a++){
			if(a % 2 == 0){
				even = even + a;

			}else{
				odd = odd + a;
			}
		}
		System.out.println("sum of even:"+even);
		System.out.println("eum of odd:"+odd);
	}

}