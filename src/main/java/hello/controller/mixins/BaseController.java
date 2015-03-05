package hello.controller.mixins;

public abstract class BaseController implements Searchable1, Searchable2 {

	private SearchableImpl searchableImpl;

	@Override
	public void search() {
		searchableImpl.search();
	}
	
	@Override
	public void searchWithFilter(String filters) {
		searchableImpl.searchWithFilter(filters);
	}
	
}
