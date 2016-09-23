package hello;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomInts {
	
	public static void main(String[] args) {
		
		int[] ints = new Random()
			.ints(1, 10)
			.limit(10)
			.toArray();
		
		System.out.println("random integers: " + Arrays.toString(ints));
		
		List<Integer> ints2 = new Random()
			.ints(1, 10)
			.limit(10)
			.boxed()
			.collect(Collectors.toList());
		
		System.out.println("random integers: " + ints2);
		
		IntStream ints3 = IntStream.of(1, 2, 3, 4, 5);
		ints3.forEach(System.out::println);
		
	}

}
