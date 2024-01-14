import java.util.Scanner; 

class obj{
	int enrollID;
	String name;

	obj(int id, String n){
		enrollID = id;
		name = n;
	}

	void show(){
		System.out.println("ID :"+enrollID+"  | Name: "+name);
	}

}

class ObjArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of your array: ");
		int size = sc.nextInt();

		obj[] a = new obj[size];
		for(int i = 0; i < size; i++){
			System.out.print("Enter the id and the name of the "+ (i+1) +" object: ");
			int id = sc.nextInt();
			String n = sc.nextLine();
			a[i] = new obj(id, n);
		}

		System.out.println("The object arrray has: ");
		for(int i = 0; i < size; i++){
			a[i].show();
		}
	}
	
}