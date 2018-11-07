package math_operators;

// Importing the utility "Scanner" for user input
import java.util.Scanner;

public class math_op {
	public static void main(String args[]) {
		
		// Static new scanner with the variable name bucky
		Scanner bucky = new Scanner(System.in);
		
		// Stating three variables and that they are 'doubles'(double are intergers that have decimal value)
		double girls, boys, people;
		
		//----------------------------------------------------------------
		// Stating the value of the three variables
		girls = 11;
		boys = 3;
		/* Reminder!
		 * Lets say that the math operator for division was used. For 11/3 the console would print '3' because 3 goes into 11 only three times.
		 * But the % symbol will out the remainder of the method used on the comment above. Which would be 2.
		 * 3 goes into 11 three times. 3*3=9, then 11-9 = 2, so the console would print '2'
		 */ 
		people = girls % boys;
		//----------------------------------------------------------------
		
		//Telling the console to print the value of the variable people
		System.out.println(people);
		
		//Telling the code to close the scanner variable to prevent errors.
		bucky.close();
	}
	
}
