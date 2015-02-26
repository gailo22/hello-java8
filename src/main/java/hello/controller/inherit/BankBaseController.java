package hello.controller.inherit;

public interface BankBaseController extends SearchableController, 
                                            ActionController, 
                                            IconLogicController, 
                                            ParentChildController,
                                            PaginationController {

}
