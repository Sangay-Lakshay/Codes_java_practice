import java.util.Scanner;

// class to implement the calculator
class Calculator{
	// main method
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// define scanner and increment i for while loop
		int i = 0;
		while(i != 6){ 
			// print the menue
			System.out.println("*****Simple Calculator*****");
			System.out.println("1. Addition\n2. Subtraction\n3. Division\n4. Multiplication\n5. Modulus\n6. Exit");
			// take in user input and creating an object to pass the values in the cunstructor.
			System.out.println("Enter two numbers: ");
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			ArthmeticOp cal = new ArthmeticOp(a, b);
			System.out.println("Enter your operation: ");
			i = sc.nextInt();
						
			// conditions to calculate according to the users choice.
			if(i == 1){
				double sum = cal.add();
				System.out.println("Sum = "+sum);
			}
			else if(i == 2){
				double diff = cal.sub();
				System.out.println("Difference = "+diff);
			}
			else if(i == 3){
				double quo = cal.div();
				System.out.println("Quotient = "+quo);
			}
			else if(i == 4){
				double multi = cal.mul();
				System.out.println("Product = "+ multi);
			}
			else if(i == 5){
				double modu = cal.mod();
				System.out.println("Modulus = "+modu);
			}
			else{
				break;
			}
		}
	}
}
// class for arthmetic operations
class ArthmeticOp{
	double num1, num2;
	//cunstructor with parameters for calculation
	ArthmeticOp(double a,double b){
		num1 = a;
		num2 = b;
	}
	// arthmetic operations
	double add(){
		return num1 + num2;
	}
	double sub(){
		return num1 - num2;
	}
	double div(){
		return num1 / num2;
	}
	double mul(){
		return num1 * num2;
	}
	double mod(){
		return num1 % num2;
	}
}