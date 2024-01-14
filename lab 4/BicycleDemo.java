import java.util.Scanner;
// class to test the classes
class BicycleDemo{
	//main method
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// create a scanner class and take user input for the variables
		System.out.println("Enter gear: ");
		int g = sc.nextInt();

		System.out.println("Enter speed: ");
		int s = sc.nextInt();
		// create an object for bicycle class and pass the input into the cunstructor
		Bicycle bike = new Bicycle(g, s);


		System.out.println("Enter height of seat for Mountainbike: ");
		int hM = sc.nextInt();
		// create an object for MountainBike class and set height of seat by passing the input into the method
		MountainBike mount = new MountainBike(g, s);
		mount.setHeight(hM);

		// check the methods of super class and the subclass
		System.out.println("superclass");
		bike.applyBreak();
		bike.speedUp();
		bike.speedUp();
		bike.tostring();


		System.out.println("subclass");
		mount.applyBreak();
		mount.applyBreak();
		mount.speedUp();
		mount.tostring();


	}
}

// superclass 
class Bicycle{
	int gear, speed;
	// cunstructor with paremeters
	Bicycle(int g, int s){
		gear = g;
		speed = s;
	}
	// method to decrese speed
	int applyBreak(){
		return speed --;
	}
	// method to increase speed
	int speedUp(){
		return speed ++;
	}
	// method to print the information of the class
	public void tostring(){
		System.out.println("Gear of Bicycle = "+ gear);
		System.out.println("Speed of Bicycle = "+ speed);
	}
}
// subclass 
class MountainBike extends Bicycle{
	int seatHeight;
	// cunstructor and set perimeters
	MountainBike(int g, int s){
		super(g, s);
	}
	// unique method to set the seat height
	int setHeight(int height){
		return seatHeight = height;
	}
	// overriding tostring() method to display information
	public void tostring(){
		System.out.println("Gear of mountain bike = "+ gear);
		System.out.println("Speed of mountain bike = "+ speed);
		System.out.println("Seat height of mountain bike = "+ seatHeight);
	}
}