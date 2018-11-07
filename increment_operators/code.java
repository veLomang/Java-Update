package increment_operators;

//We know this already
import java.util.Scanner;

public class code {
	public static void main(String args[]) {

		//We know this already
		Scanner bucky = new Scanner(System.in);
		
		//We know this already
		int tuna = 5;

		// ++ Adds 1 to the variable very quickly (Called "Pre-incrementing")
		/* --------------------------------------------------------------------------------------------------
		 * int tuna = 5;
		 * System.out.println(tuna) would print out 5
		 * ---------------------------------
		 * ++tuna
		 * System.out.println(tuna) would print out 6
		 * --------------------------------
		 * int tuna = 5;
		 * System.out.println(tuna++) would print out 5...
		 * But if we called the tuna variable again "System.out.println(tuna)" it would return 6.
		 * That is because the ++ AFTER the variable is put into play only AFTER the variable is returned!
		 * You can also use "var--" or "--var"
		 * --------------------------------------------------------------------------------------------------
		 */
		
		//This is another way of saying tuna + 8;.... You can also use other math operators (Ex: -=, *=, /=, etc.)
		tuna += 8; 
		
		//We know this already
		System.out.println(tuna);
		
		//Tells code to close scanner to prevent error...
		bucky.close();
	}
}
