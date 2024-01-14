import java.util.Scanner;

//main method
class GradeBookTest{
	public static void main(String[] args){
		// create object
		GradeBook A = new GradeBook();
		// set up for user input
		Scanner sc = new Scanner(System.in);
		// prompt user
		System.out.println("Enter course name: ");
		A.courseName = sc.nextLine();
		//call method from gradebook class through object
		A.setCourseName(A.courseName);
		A.getCourseName();
		A.displayMessage();


	}
}

// class for gradebook
class GradeBook{
	// instance variable
	String courseName;

	// method to set course
	String setCourseName(String course){
		return courseName = course;

	}// method to get course
	void getCourseName(){
		System.out.println("The course you chose is: "+ courseName);

	}// method to display message
	void displayMessage(){
		System.out.println("Welcome to "+ courseName);

	}

}



