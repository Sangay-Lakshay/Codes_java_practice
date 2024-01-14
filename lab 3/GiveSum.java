class GiveSum{
	public static void main(String args[]){
		// give a variable sum 
		int sum = 0;
		// add all the elements into sum
		for(int i = 0; i < args.length; i++){
			//convert the string into integer 
			sum += Integer.parseInt(args[i]);
		}
		//print out the total sum
		System.out.println("The sum of the numbers you have given is: "+ sum);
	}	
}