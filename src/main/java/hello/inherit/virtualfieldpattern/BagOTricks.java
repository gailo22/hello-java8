package hello.inherit.virtualfieldpattern;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class BagOTricks<T> implements PeekerView<T>, ListView<T>, SupplierView<T> {

	private List<T> underlying = null; //...
	private Peeker<T> peeker = new ListPeeker<T>(underlying);
	private Supplier<Optional<T>> supplier = new ListSupplier<T>(underlying);
	
	@Override
	public Peeker<T> getPeeker() {
	    return peeker;
	}
	
	@Override
	public List<T> getList() {
	    return underlying;
	}
	
	@Override
	public Supplier<Optional<T>> getOptionalSupplier() {
	    return supplier;
	}
}
