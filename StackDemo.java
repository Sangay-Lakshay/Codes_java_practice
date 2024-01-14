class StackDemo{
	public static void main(String[] args){
		IntStack s = new Stack(3);


		s.push(1);
		s.push(2);
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
	
}

interface IntStack{
	void push(int a);
	int pop();
	boolean isEmpty();
}

class Stack implements IntStack{
	private int stak[];
	private int tos;

	Stack(int size){
		stak = new int[size];
		tos = -1;
	}

	public void push(int a){
		if(tos == stak.length-1){
			System.out.println("Stack is full");

		}else{
			stak[++tos] = a;
		}
	}

	public int pop(){
		if(tos < 0){
			System.out.println("Stack is empty");
			return 0;
		}else{
			int b = stak[tos--];
			return b;
		}
	}

	public boolean isEmpty(){
		return tos < 0;
	}

}