package constructors; // Constructor creates a variable as soon as you create your object

public class apples {
	public static void main(String args[]) {

		// These two objects can NOT see each others variables!
		java javaObject = new java("Weenie"); //Parameters pass an argument
		java javaObject2 = new java("Hut Jrs");
		javaObject.saying();
		javaObject2.saying();
	}
}
