// class to test the spoon and arm class
class BendableTest{
	//main method
	public static void main(String[] args){
		// two objects of type Bendable each for spoon and arm
		Bendable a = new Spoon();
		Bendable b = new Arm();
		// to call and test the methods
		System.out.println("The spoon classs implementing Bendable");
		a.bend();
		System.out.println();
		System.out.println("The Arm class implementing Bendable");
		b.bend();

	}
}
// interface class Bendable
interface Bendable{
	// with method bend
	public void bend();

}
// class spoon will implement Bendable and inherit method bend
class Spoon implements Bendable{
	// give method body for method bend
	public void bend(){
		System.out.println("Spoon can bend");

	}// unique method eat of spoon class	
	public void eat(){
		System.out.println("Eat with spoon");
	}
}
// class arm will implement Bendable and inherit method bend
class Arm implements Bendable{
	// give method body for method bend
	public void bend(){
		System.out.println("Arm can bend");

	}// unique method raise for arm class
	public void raise(){
		System.out.println("Raise arm to eat");
	}
}