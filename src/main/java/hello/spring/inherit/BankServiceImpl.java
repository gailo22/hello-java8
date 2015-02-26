package hello.spring.inherit;

public class BankServiceImpl extends BaseServiceImpl implements BankService {

	@Override
	public String searchBank(String str) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public static void main(String[] args) {
		
		BankService bankService = new BankServiceImpl();
		bankService.searchBank("abc");
	}

}
