package random_numGen;

import java.util.Random;

public class apples {
	public static void main(String args[]) {
		Random dice = new Random();
		int number;
		
		for (int counter = 1; counter <= 10; counter++) {
			number = 1+dice.nextInt(6); // If argument is 6, program takes numbers: 0,1,2,3,4,5 | 1+ argument takes number: 1-6
			System.out.println(number + " ");
		}
	}
}
