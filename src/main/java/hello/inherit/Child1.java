package hello.inherit;

public class Child1 implements Parent1, Parent2 {

	@Override
	public void sayHello(String name) {
		sayHelloDefault(name);
	}

	
	@Override
	public void sayHelloDefault(String name) {
		// TODO Auto-generated method stub
		Parent1.super.sayHelloDefault(name);
	}


	public static void main(String... args) {
		Parent1 c1 = new Child1();
		
		c1.sayHello("Johnny");
	}


	@Override
	public void sayHi(String name) {
		// TODO Auto-generated method stub
		
	}
}
