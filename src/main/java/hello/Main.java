package hello;

import java.util.Arrays;
import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		
		int[] ints = new Random()
			.ints(1, 10)
			.limit(10)
			.toArray();
		
		System.out.println("before ints: " + Arrays.toString(ints));
		sort(ints);
		System.out.println("after ints: " + Arrays.toString(ints));
	}

	private static void sort(int[] ints) {
		// TODO Auto-generated method stub
		
	}

}
