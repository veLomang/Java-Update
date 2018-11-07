package summing_elementsOfArray;

public class apples {
	public static void main(String args[]) {
		int bucky[]= {21,16,86,21,3};
		int sum = 0;
// Counter = 0, while counter is less than the length of the array: add one. 
		for(int counter=0; counter<bucky.length; counter++) {
			//Take value of the next array value and add it to sum.
			sum+=bucky[counter];
		}
			System.out.println("The sum of these numbers is " + sum);
	}
}
