// An array is a variable that stores a bunch of values (of one data type)!
package intro_to_arrays;

public class apples {
	public static void main(String args[]) {
		//int bucky = interger | int bucky[] = array
		int bucky1[] = new int[10]; //[10] Means storing 10 number/values
	
		// Values for array value...
		bucky1[0]=87;
		bucky1[1]=543;
		bucky1[9]=65;
		
		//Array initializer:
		int bucky[]= {2,4,5,7,9};
		
		
		// Prints out the value of the array value [1];
		System.out.println(bucky[1] + "\n" + bucky1[1]);
	}
}
