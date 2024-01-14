import java.util.Scanner;

//Creat class 
class Marks{
	public static void main(String[] args){
		// scanner for user input
		Scanner sc = new Scanner(System.in);
		//size of the array is already decided
		int std = 6;
		int sub = 5;
		// then we create a 2D array
		int[][] a = new int[std][sub];
		// next we input the marks of each student
		for(int i = 0; i < std; i++){
			// the rows are the students and are identified by numbers from 1-6
			System.out.println("Enter the marks for Student no."+ (i+1));
			for(int j = 0; j < sub; j++){
				//subjects are the columns and are alos identified by numbers from 1-5
				System.out.println("Subject no."+ (j+1) +":");
				a[i][j] = sc.nextInt();
			}
			
		}
		//then we find the average marks of each student
		System.out.println("Average marks of each student are:");
		//the sum and average are created then sum is initilized to 0
		int sum = 0, average;
		for(int i = 0; i < std; i++){
			for(int j = 0; j < sub; j++){
				sum += a[i][j];
			}//since this inner loop is for subjects the total sum of the marks are calculated
			//then divided by total number of subjects  
			average = sum / 5;
			System.out.println("Student no."+(i+1)+": "+ average);
			// the sum is set to 0 again so that the average of the next student can be calculated.
			sum = 0;
		}
	}
}