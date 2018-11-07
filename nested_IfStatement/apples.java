package nested_IfStatement;

public class apples {
	public static void main(String args[]) {
		int age = 60;
						// If/Else statement embedded into another If/Else statement... This is called nesting.
		if (age < 50) {
			System.out.println("You are young.");
		} else {
			System.out.println("You are old.");
			if (age > 75) {
				System.out.println("You are old as fuck!");
			} else {
				System.out.println("Don't worry, you aren't really that old.");
			}
		}
	}
}
