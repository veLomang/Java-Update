package logical_operators;

public class Code {
	public static void main(String args[]) {
		int boy, girl;
		boy = 18;
		girl = 61;
		
		// -- if (boy > 10 && girl < 60) -- && means both conditions must be true for the statement to be true.
		// -- if (boy > 10 || girl < 60) -- || means one condition must me true. || = 'or'
		if(boy > 10 && girl < 60) {
			System.out.println("You cant enter");
		} else {
			System.out.println("You can not enter");
		}
	}

}
