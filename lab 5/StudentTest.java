// class to test PG_Students and UG_Students class
class StudentTest{
	//main method
	public static void main(String[] args){
		// two object of type Student each for PG_Students and UG_Students class
		Student a = new PG_Students();
		Student b = new UG_Students();
		// calling methods to test
		a.Display_Grade();
		a.Attendance();
		System.out.println();
		b.Display_Grade();
		b.Attendance();

	}
}
// interface class Student
interface Student{
	// with two mwthod 
	public void Display_Grade();
	public void Attendance();
}
// class PG_Students will implement Student
class PG_Students implements Student{
	// give method body for method Display_Grade
	public void Display_Grade(){
		System.out.println("Grades for Post Graguate student");
	}// give method body for method Attendance
	public void Attendance(){
		System.out.println("Attendance for Post Graguate student");
	}

}
// class UG_Student will implement Student
class UG_Students implements Student{
	// give method body for method Display_Grade
	public void Display_Grade(){
		System.out.println("Grades for Under Graguate student");

	}// give method body for method Attendance
	public void Attendance(){
		System.out.println("Attendance for Under Graguate student");

	}
}