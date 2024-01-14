import java.util.Scanner;

class square{

	double s;
	// defining a constructor and adding perimeter
	square(double a){
		s = a;
	}

	double area(){
		return s * s;
	}

	double parimeter(){
		return 4 * s;
	}
}

class squareDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the side of the suare: ");
		double d = sc.nextDouble();
		// giving the argument into the constructure
		square S = new square(d);

		System.out.println("The area of you square is: " + S.area());
		System.out.println("The perimeter of you square is: " + S.parimeter());
	}

}