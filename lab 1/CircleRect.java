import java.util.Scanner;

// i used methods here thinking it might be a good practice for me, though it is not necessary 
class CircleRect{
	public static void main(String[] arg){
		// take input from user for radius, weidth and height
		Scanner sc = new Scanner(System.in);
		// first radius to calculate the area and circumference of circle
		System.out.println("Enter radius:");
		int r = sc.nextInt();
		// then call method for circle so that it is calculated first
		circle(r);
		// take the input for height and weidth
		System.out.println("Enter height:");
		int h = sc.nextInt();
		System.out.println("Enter width:");
		int w = sc.nextInt();
		// then call the ractrangle method to calculate area and perimeter 
		rectangle(h, w);
		
	}
	// method for circle
	public static void circle(int r){
		// area and circumference is set to double because of the pi value. 
		double area, cir;
		// then set the condition to see if the radius is negative or positive.
		if( r > 0 ){
			// executes if it is positive and calculates the ares and circumference
			area = 3.14 * r * r;
			cir = 2 * 3.14 * r;
			System.out.println("Area of circle: "+ area);
			System.out.println("Circumference of circle: "+ cir);

		// if the input is negative then the message is printed saying it is invalid
		}else{
			System.out.println("Error invalid value, value should be positive and more than 0");
		}
	}
	// method for rectrangle
	public static void rectangle(int h, int w){
		int area, per;
		//checks if the input is positive or not
		if( h > 0 && w > 0){
			// if true then calculates the area and perimeter
			area = h * w;
			per = 2 * h + 2 * w;
			System.out.println("Area of rectrangle: "+ area);
			System.out.println("Perimeter of rectangle: "+ per);
		// if the input is negative then it gives the message that it is invalid
		}else{
			System.out.println("Error invalid value, value should be positive and more than 0");
		}

	}
}