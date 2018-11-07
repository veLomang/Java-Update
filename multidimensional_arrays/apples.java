package multidimensional_arrays;

public class apples {
	public static void main(String args[]) {
		int firstArray[][]= {{8,9,10,11},{12,13,14,15}}; //[] - one for row and one for column
		int secondArray[][]= {{30,31,32,33},{43},{4,5,6}};	
		
		System.out.println("This is the first array");  //-\
		display(firstArray);							//--\
														//   > Calls display method with the arrays as arguments
		System.out.println("This is the second array"); //--/
		display(secondArray);
	}

	//Creating new method with an argument: Type: int, Element: x = any array, two arguments for column and row
	public static void display(int x[][]) {
		//int row = 0, if it is less than the length of the array, add 1.
		for(int row=0;row<x.length;row++) { 
			//columns = 0, if the column is less than the length of the row...
			for(int column=0;column<x[row].length;column++) {
				//Print out the array with row and column as a table
				System.out.print(x[row][column]+ "\t");
			}
			System.out.println();
		}
	}
}
