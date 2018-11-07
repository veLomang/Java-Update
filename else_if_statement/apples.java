package else_if_statement;

import java.util.Scanner;

public class apples {
	public static void main(String args[]) {
		int age;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		age = input.nextInt();
		
		if (age >= 100) //If you have one line of code after the condition you do not need to use {}
			System.out.println("You are going to die real soon, pal...");
		else if (age >= 60)
			System.out.println("You are a senior citizen");
		else if (age >= 50)
			System.out.println("You are in your 50s");
		else if (age >= 40)
			System.out.println("You are in your 40s");
		else 
			System.out.println("You are a young buck");
		
		input.close();
	}
}
