import java.util.Scanner;

class marks{
	public static void main(String[] args){
		// ask the user for marks input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you marks:");
		int m = sc.nextInt();
		// call the method toGrad to check the grade
		toGrade(m );
	}
	// method to check the grade 
	public static void toGrade(int m){
		// conditions set to check the grade.
		// F for 0-39
		if(m >= 0 & m <= 39){
			System.out.println("Grade : F");
		}
		// D for 40-54
		else if(m >= 40 & m <= 54){
			System.out.println("Grade : D");
		}
		// C for 55-69
		else if(m >= 55 & m <= 69){
			System.out.println("Grade : C");
		}
		// B for 70-84
		else if(m >= 70 & m <= 84){
			System.out.println("Grade : B");
		}
		// A for 85-100
		else if( m >= 85 & m <= 100){
			System.out.println("Grade : A");
		}
	}
}