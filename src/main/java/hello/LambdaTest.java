package hello;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaTest {
	
	int z = 2;

	public static void main(String[] args) {
		
		List<Integer> integers = Arrays.asList(1,2,3,4,5);
		
		int y = 1;
		integers.forEach(x -> System.out.println(x + y));
		
		Consumer<Integer> consumer1 = x -> doSomething(x);
		consumer1.accept(1);
		
		Consumer<Integer> consumer2 = LambdaTest::doSomething;
		consumer2.accept(2);
		
		Consumer2<Integer> consumer3 = (x1, x2) -> doSomething2(x1, x2);
		consumer3.accept(3, 4);
		
		Consumer2<Integer> consumer4 = LambdaTest::doSomething2;
		consumer4.accept(5, 6);
		
		Function<String, Integer> mapper1 = x -> new Integer(x);
		System.out.println(mapper1.apply("123"));
		
		Function<String, Integer> mapper2 = Integer::new;
		System.out.println(mapper2.apply("456"));
		

	}
	
	public static void doSomething(int x) {
		System.out.println(x);
	}
	
	public static void doSomething2(int x, int y) {
		System.out.println(x + y);
	}
	
}
