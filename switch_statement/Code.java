package switch_statement;

public class Code {
	public static void main(String args[]) {
		int age;
		age = 4;
		
		//What ever variable is in its condition gets tested
		switch (age) {
		//If variable equals 1 -> Do this (and so on...)
		case 1: 
			System.out.println("You can crawl");
			break; // Since the case has been found, break stops the program from running the rest of the code.
			
		case 2:
			System.out.println("You can talk");
			break;
		
		case 3:
			System.out.println("You can get in trouble");
			break;
		// Default means that if none of the cases match the switch condition -> *do this*... Ex: "Invalid Input"
		default:
			System.out.println("I don't know how old you are");
			break;
		}
	}

}
