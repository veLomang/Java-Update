package creating_arrayTable;
//Basic visual table of index and value of array.
public class apples {
	public static void main(String args[]) {
		
		// '\t' creates a table
		System.out.println("Index\tValue");
		int bucky[]= {32,12,18,54,2};
		// 'int counter' must start at zero because computer counts from 0
		for(int counter = 0; counter < bucky.length; counter++) {
			// Counter has same value as index
			System.out.println(counter + "\t" + bucky[counter]); 
		}
	}
}
