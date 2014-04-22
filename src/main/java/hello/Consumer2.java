package hello;

@FunctionalInterface
public interface Consumer2<T> {
	
	void accept(T x, T y);
	
}
