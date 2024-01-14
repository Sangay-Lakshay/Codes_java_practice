import java.util.*;
/*
guessing game
generate number
user guess
input == guess win
input < guess low guess
input > guess high guess*/

class GuessingGame{
	public static void main(String[] args){
		Random r = new Random();
		int num = r.nextInt(10);

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the guessing game!");
		System.out.println("You get to take 5 guess");
		int guess = -1;
		int counter = 5;
		while(guess != num && counter!=0){

			System.out.print("Enter your guess number: ");
			guess = sc.nextInt();

			if( guess == num){
				System.out.println("Your guess is correct!");
				counter --;
			}
			else if( guess > num){
				System.out.println("Your guess is high!");
				counter --;
				System.out.println("You have "+counter+" guesses left!");
			}
			else{
				System.out.println("Your guess is low!");
				counter --;
				System.out.println("You have "+counter+" guesses left!");
			}
		 	System.out.println();

		}
		
	}

}