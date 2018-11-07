package arrayElements_asCounters;

import java.util.Random;

public class apples {
	public static void main(String args[]) {
		Random rand = new Random();
		int freq[] = new int[7];
		
		for(int roll=1; roll<1000; roll++) {
			// '++freq' = If you role 3 two times, the (3 index = 2) keeps rolls even.
			++freq[1+rand.nextInt(6)];
		}
		
		System.out.println("Face \t Frequency");
		
		//Creates the table of lists 1-6
		for(int face=1;face<freq.length;face++) {
			System.out.println(face+ "\t" +freq[face]);
		}
	}
}
