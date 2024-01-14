import java.util.Scanner;

// main method
class InvoiceTest{
	public static void main(String[] args){
		// create an object
		Invoice B = new Invoice();

		Scanner sc = new Scanner (System.in);
		// prompt user for item number
		System.out.println("Enter Part Number:");
		B.PartNumber = sc.nextLine();
		// prompt user for item description
		System.out.println("Enter Item Description:");
		B.Description = sc.nextLine();
		// prompt user for quantity of item 
		System.out.println("Enter Quantity of item:");
		B.Quantity = sc.nextInt();
		// prompt user for item price
		System.out.println("Enter Item Price:");
		B.PricePerItem = sc.nextDouble();
		// call method of invoice from object
		B.getPartNumber();
		B.getDescription();
		B.getQuantity();
		B.getPricePerItem();
		B.getInvoiceAmount();

	}

}

// class for invoice
class Invoice{
	// set instance variable 
	String PartNumber, Description;
	int Quantity;
	double PricePerItem, Amount;
	// method to set item number
	String setPartNumber(String num){
		return PartNumber = num;
	}
	// method to get item number
	void getPartNumber(){
		System.out.println("Item number: "+PartNumber);
	}
	// method to set item discription
	String setDescription(String d){
		return Description = d;
	}
	// method to get item discription
	void getDescription(){
		System.out.println("Description of item: "+Description);
	}
	// method to set quantity of item
	int setQuantity(int qun){
		return Quantity = qun;
	}
	// methot to get quantity of item
	void getQuantity(){
		System.out.println("Quantity of item: "+ Quantity);
	}
	// method to set price of item
	double setPricePerItem(double price){
		return PricePerItem = price;
	}
	// method t oget price of item
	void getPricePerItem(){
		System.out.println("Price per item: "+PricePerItem);
	}
	// method to calculate the total amount of price 
	void getInvoiceAmount(){
		double Amount = PricePerItem * Quantity ;
		System.out.println("The total amount is: " + Amount);
	}

}

