import java.util.Scanner;

class EvenThread extends Thread{
	int max;

	EvenThread(int m ){
		max = m;
	}

	public void run(){
		try{
			for(int i = 1; i <=max; i++){
				if(i % 2 == 0){
					System.out.println("EvenThread " + i);
					Thread.sleep(500);
				}
			}
		}catch(InterruptedException e){
			System.out.println("Error! Interrupted");
		}
		System.out.println("Complete EvenThread");
	}

}

class OddThread extends Thread{
	int max;

	OddThread(int m ){
		max = m;
	}

	public void run(){
		try{
			for(int i = 1; i <=max; i++){
				if(i % 2 == 1){
					System.out.println("OddThread " + i);
					Thread.sleep(1000);
				}
			}
		}catch(InterruptedException e){
			System.out.println("Error! Interrupted");
		}
		System.out.println("Complete OddThread");
	}

}

class MultiThread extends Thread{
	int max;

	MultiThread(int m ){
		max = m;
	}
	public void run(){
		try{
			for(int i = 0; i <= max; i++){
				System.out.println("MultiThread " + i);
				Thread.sleep(2000);
			}
		}catch(InterruptedException e){
			System.out.println("Error! Interrupted");
		}
		System.out.println("Complete MultiThread");
	}
}

class SquareThread extends Thread{
	int n, s, s2;
	s = Math.sqrt(n);
	s2 = s ^ 2;
	if(s2 == n){
		System.out.println("The given number is perfect square")
	}
}

class MainThread{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter upper bound for MultiThread: ");
		int a1 = sc.nextInt();

		System.out.print("Enter upper bound for EvenThread: ");
		int b1 = sc.nextInt();

		System.out.print("Enter upper bound for OddThread: ");
		int c1 = sc.nextInt();


		MultiThread a = new MultiThread(a1);
		EvenThread b = new EvenThread(b1);
		OddThread c = new OddThread(c1);

		a.start();
		b.start();
		c.start();

	}	
}