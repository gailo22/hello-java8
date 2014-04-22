package hello;

import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) throws Exception {
		List<String> list = Arrays.asList("a", "b", "c", "d");
		
		list.stream()
			.filter(s -> s.equals("a") || s.equals("c"))
			.forEach(System.out::println);
		
		String workingDir = System.getProperty("user.dir");
		Path workingPath = FileSystems.getDefault().getPath(workingDir);
		
		System.out.println("Directory List: ");
		Files.list(workingPath)
			.forEach(System.out::println);
		
		System.out.println("Depth First Directory: ");
		Files.walk(workingPath)
		.forEach(System.out::println);
		
		
		List<Integer> integers = Arrays.asList(1,2,3,4,5);
		
		Integer sum = integers.stream().reduce(0, (x,y) -> x + y);
		System.out.println("sum: " + sum);
		
		Set<Integer> set = integers.stream().collect(Collectors.toSet());
		System.out.println("set: " + set);
		
		Integer[] array = integers.stream().toArray(Integer[]::new);
		System.out.println("array: " + array);
		Arrays.stream(array).forEach(System.out::println);
		
	}

}
