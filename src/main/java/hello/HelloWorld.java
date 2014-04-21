package hello;

public class HelloWorld {
	
	public static void main(String[] args) {
		
		execute(() -> System.out.println("Hello, world"));

	}
	
	public static void execute(Greeter greeter) {
		greeter.sayHello();
    }
	
}