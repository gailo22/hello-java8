package hello.inherit.virtualfieldpattern;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class ListSupplier<T> implements Supplier<Optional<T>>{

	public ListSupplier(List<T> underlying) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Optional<T> get() {
		// TODO Auto-generated method stub
		return null;
	}

}
