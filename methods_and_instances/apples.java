package methods_and_instances;

import java.util.Scanner;

public class apples {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		tuna tunaObject = new tuna();
		System.out.println("Enter your first gf's name: ");
		String temp = input.nextLine();
		tunaObject.setName(temp);
		tunaObject.saying();
		input.close();
	}

}
