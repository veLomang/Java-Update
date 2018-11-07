package multiple_classes;
// Java always looks for something called "main" when the code starts


public class apples {
	public static void main(String args[]) {
		
		//Create object of the class
		tuna tunaObject = new tuna();
		//Calling the method from the 'tuna' class...
		tunaObject.simpleMessage();
	
		bear bearObject = new bear();
		bearObject.numberLister();
	}
}
