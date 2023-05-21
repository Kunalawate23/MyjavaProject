package encapsulation;

public class UpdateAndCheckBalance {

	public static void main(String[] args) {
		
		AccountBalance a=new AccountBalance();
		System.out.println(a.getBalance());
		a.setBalance(500.10);
		System.out.println(a.getBalance());
		a.setBalance(700);
		System.out.println(a.getBalance());
		
		
		
	}

}
