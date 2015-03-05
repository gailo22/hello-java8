package hello.inherit.virtualfieldpattern;

import java.util.Optional;
import java.util.function.Supplier;

public interface SupplierView<T> {

	Supplier<Optional<T>> getOptionalSupplier();

}
