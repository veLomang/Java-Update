package simple_averaging_program;

import java.util.Scanner;

public class apples {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int total = 0;
		int grade;
		int average;
		int counter = 0;
		
		System.out.println("Enter 10 numbers to get an average: ");
		
		while (counter < 10) {
			grade = input.nextInt();
			total = total + grade;
			counter++;
			
		}
		average = total/10;
		System.out.println("Your average is " + average + ".");
		input.close();
	}
}
