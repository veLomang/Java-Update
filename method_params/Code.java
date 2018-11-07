package method_params;

import java.util.Scanner;

public class Code {
	public static void main(String args[]) {
			//Creating var for new scanner
			Scanner input = new Scanner(System.in);
			//Creating var for the other class (tuna)
			tuna tunaObject = new tuna();
			
			//UserInterface
			System.out.print("Enter your name here: ");
			String name = input.nextLine();
			
			//Calls the string method and name variable from the other class
			tunaObject.simpleMessage(name);
			
			//Closes the scanner to prevent error
			input.close();
	}
}
