// class to check the cat class and the dog class
class AnimalDemo{
	// main method
	public static void main(String[] args){
		// creat object for cat class and dog  class
		Cat c = new Cat();
		Dog d = new Dog();

		// check the methods from the classes through the objects
		c.eat();
		c.sleep();
		c.makeNoise();
		c.roam();
		System.out.println();
		d.eat();
		d.sleep();
		d.makeNoise();
		d.roam();
	}
	
}
// abstract class of animal with four of its abstract methods
abstract class Animal{
	abstract void eat();
	abstract void sleep();
	abstract void makeNoise();
	abstract void roam();
}
// subclass cat of super class animal
class Cat extends Animal{
	// give the method body for the class
	void eat(){
		System.out.println("Cat eat Fish");
	}
	void sleep(){
		System.out.println("Cat Sleep cute");
	}
	void makeNoise(){
		System.out.println("Cat say Meow");
	}
	void roam(){
		System.out.println("Nowhere to be seen");
	}
}

// sub class dog of super class animal
class Dog extends Animal{
	//give the method body for the class
	void eat(){
		System.out.println("Dog eat bone");
	}
	void sleep(){
		System.out.println("Dog Sleep ugly");
	}
	void makeNoise(){
		System.out.println("Dog bark Woof");
	}
	void roam(){
		System.out.println("Always Sleeping that too ugly");
	}
}