import java.util.Scanner;
//created a class
class StandardDeviation{
	public static void main(String[] args){
		//set scanner for user input
		Scanner sc = new Scanner(System.in);
		//prompt the user for size of the array
		System.out.println("Enter the size of the array:");
		int size = sc.nextInt();
		//create an array with the size that the user will give
		double[] arr = new double[size];
		//then take input from the user for each element
		for(int i = 0; i<size; i++){
			//prompt the user for elements
			System.out.println("Enter element for index "+i+" :");
			arr[i] = sc.nextDouble();
		}

		double sum, mean, difference, sqDiff, avgSq, standardDeviation;
		//first find the sum of all the elements
		sum = 0;
		for(int i = 0; i < size; i++){
			sum += arr[i];
		}
		//then divide the sum by the size to get the mean
		mean = sum / size;
		System.out.println("The mean is: "+ mean);
		// create a new array to store the new elements which were subtracted with the mean
		double[] arr1 = new double[size];
		// subtract each element with the mean
		for(int i = 0; i < size; i++){
			difference = arr[i] - mean;
			arr1[i] = difference;
		}
		//then find the square of the difference of each element and store them into the firat array arr 
		for(int i = 0; i < size; i++){
			sqDiff = arr1[i] * arr1[i];
			arr[i] = sqDiff;
		}
		//again initialize the sum to 0   
		sum = 0;
		for(int i = 0; i < size; i++){
			sum += arr[i];
		}// add all the square od the difference and divide by size to get the average
		avgSq = sum / size;
		// lastly find the square root of the average which is the standard deviation.
		standardDeviation = Math.sqrt(avgSq);
		System.out.println("The standard deviation is: " + standardDeviation);
			
	} 
}