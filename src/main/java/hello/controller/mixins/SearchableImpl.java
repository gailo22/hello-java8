package hello.controller.mixins;

public class SearchableImpl implements Searchable1, Searchable2 {

	@Override
	public void search() {
		System.out.println("search...");
	}

	@Override
	public void searchWithFilter(String filters) {
		System.out.println("searchWithFilter...");
	}

}
