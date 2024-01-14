import java.util.Scanner;

class arrQ{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Scanner sa = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int s = sc.nextInt();

		String[] arr = new String[s];

		for(int i = 0; i < s; i++){
			System.out.println("Enter: ");
			String v = sa.nextLine();
			arr[i] = v;
		}
		.
		System.out.println("Word with less than 2 vowels");
		int count;
		String w;
		for(int i = 0; i < s; i ++){
			count = 0;
			w = arr[i];
			for(int j = 0; j < w.length(); j++){
				char c = w.charAt(j);
				
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
					count += 1;
				}
			}
			if(count < 3){
				System.out.println(w);
			}
		}

	}
	
}