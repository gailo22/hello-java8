package hello.controller.inherit;

public abstract class BaseController implements SearchableController, 
                                                ActionController, 
                                                IconLogicController, 
                                                ParentChildController,
                                                PaginationController {

	@Override
	public String getParent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getChild() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void resolveIcons() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void edit() {
		// TODO Auto-generated method stub
		
	}

	public final void onSearch(String str) {
		search(str);
		
		// do other things
	}
	
	@Override
	public int getPageSize() {
		// TODO Auto-generated method stub
		return 0;
	}

}
