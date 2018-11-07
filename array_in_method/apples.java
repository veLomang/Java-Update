package array_in_method;

public class apples {
	public static void main(String agrs[]) {  //Main method
		//Array
		int bucky[]= {3,4,5,6,7};
		//calling method	
		change(bucky);
		
		// y is bucky, but after calling the method each value in original array has 5 added to them.
		for(int y:bucky)
			System.out.println(y);
	}
	
	//Building a method with a parameter if "one array (int x[])"
	public static void change(int x[]) {
		for(int counter=0;counter<x.length;counter++)
			//Takes all indexes in array and adds 5 to them.
			x[counter]+=5;
	}
}
