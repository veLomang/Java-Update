package calculator;

import java.util.Scanner;

public class calc {
	//Stating method
	public static void main (String args[]) {
		
		//Creating scanner variable
		Scanner bucky = new Scanner(System.in);
		
		//Declaring three variables for what will be needed.
		double fnum, snum, answer;
		
		//Printing line for user
		System.out.println("Enter first number: ");
		
		/* Declaring value of what fnum will be
		 * Calling scanner varbiable 
		 * Stating that the double that the user gives will be next double
		 */
		fnum = bucky.nextDouble();
		
		//Printing line for user
		System.out.println("Enter second number: ");
		
		/* Declaring value of what fnum will be
		 * Calling scanner varbiable 
		 * Stating that the double that the user gives will be next double
		 */
		snum = bucky.nextDouble();
		
		//Stating that the answer variable will be the two numbers that the user gave us summed together
		answer = fnum + snum;
		
		//Tells the code to print out the answer variable for the user
		System.out.println(answer);
		
		//Exiting the scanner to prevent an error
		bucky.close();
	}
}
