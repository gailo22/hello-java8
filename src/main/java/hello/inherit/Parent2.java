package hello.inherit;

@FunctionalInterface
public interface Parent2 {
	
	void sayHi(String name);
	
	default void sayHelloDefault(String name) {
		System.out.println("Hello default from Parent2: " + name);
	}

}
