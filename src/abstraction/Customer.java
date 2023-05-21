package abstraction;

public class Customer extends ATM {
	
	public void withdrawMoney() 
	{
		System.out.println("Go to bank and withdraw money");
		 ATM a=new ATM();
		 a.deposit();
		 a.withdrawal();
		
	}
	
	public void depositMoney()
	{
		System.out.println("Go to ATM and deposit money");
		 
		Bank b=new ATM();
		b.deposit();
	}

}
