package enhancedForLoop;
//Enhanced 'for' statement
public class apples {
	public static void main(String args[]) {
		//Array with 5 values.
		int bucky[]={3,4,5,6,7};
		//Variable with value of 0 to hold sum of array
		int total=0;
		
		//Enhanced for statement with type and identifier with what array im working with
		for(int x: bucky) {
			//Added value of array for sum
			total+=x;
		}
		//Print out total of array
		System.out.println(total);
	}
}
