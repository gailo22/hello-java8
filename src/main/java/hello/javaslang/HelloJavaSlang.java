package hello.javaslang;

import static javaslang.API.$;
import static javaslang.API.Case;
import static javaslang.API.Match;

import javaslang.Function1;
import javaslang.Function2;
import javaslang.Tuple;
import javaslang.Tuple2;
import javaslang.control.Option;

public class HelloJavaSlang {
	
	public static void main(String[] args) {
		
		Tuple2<String, Integer> java8 = Tuple.of("Java", 8);
		System.out.println(java8._1 + " : " + java8._2); // Java : 8
		
		Tuple2<String, Integer> that = java8.map(
				s -> s + "slang",
				i -> i / 4);
		System.out.println("that: " + that); // that: (Javaslang, 2)
		
		Function2<Integer, Integer, Integer> sum = (a, b) -> a + b;
		System.out.println("sum: " + sum.apply(1, 2)); // sum: 3
		
		// lifting
		Function2<Integer, Integer, Integer> divide = (a, b) -> a / b;
		Function2<Integer, Integer, Option<Integer>> safeDivide = Function2.lift(divide);
		Option<Integer> i1 = safeDivide.apply(1, 0);
		Option<Integer> i2 = safeDivide.apply(4, 2);
		System.out.println("i1: " + i1 + ", i2: " + i2); // i1: None, i2: Some(2)
		
		// currying
		Function1<Integer, Integer> add2 = sum.curried().apply(2);
		System.out.println("add2.apply(4): " + add2.apply(4)); // add2.apply(4): 6
		
		// pattern matching
		int i = 2;
		String s = Match(i).of(
		    Case($(1), "one"),
		    Case($(2), "two"),
		    Case($(), "?")
		);
		System.out.println("s: " + s); // s: two
		
		i = 10;
		Option<String> ss = Match(i).option(
		    Case($(0), "zero")
		);
		System.out.println("ss: " + ss); // ss: None
		
	}

}
