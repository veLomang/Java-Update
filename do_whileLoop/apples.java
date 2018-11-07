package do_whileLoop;

public class apples {
	public static void main(String args[]) {
		int counter = 0; // if counter was set to 15, the system would print out 15 and the while loop would do nothing.
		
		do {
			System.out.println(counter);
			counter++;
		}while(counter <= 10);
	}
}
