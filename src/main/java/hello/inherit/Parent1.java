package hello.inherit;

@FunctionalInterface
public interface Parent1 {
	
	void sayHello(String name);
	
	default void sayHelloDefault(String name) {
		System.out.println("Hello default from Parent1: " + name);
	}

}
