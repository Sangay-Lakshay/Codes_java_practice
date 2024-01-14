/*
Q - code to take emp net salary as input and according to the conditions, print the emp status;
 -if net income > 1500000, emp status will be "high income class"
 -if 1500000 >= net income > 1200000, emp status "Upper middle income class"
 -if 1200000 >=net incom > 800000, emp status "Lower middle incom class" 
 -if net income <= 800000, emp status "Low income class"
 no if statement
*/

class Salary{
	int salary;
		
		Salary(int s){
			salary = s;
		}
		public static void main(String[] args){
		switch(salary){
			case salary >= 1500000:
				System.out.println("High Income class");
				break;

			case 12000000 < salary <= 1500000:
				System.out.println("Upper Middle Income class");
				break;

			case 800000 < salary <= 1200000:
				System.out.println("Lower Middle Income class");
				break;

			case salary <= 800000:
				System.out.println("Low Income class");
				break;
		}
		}
	
}