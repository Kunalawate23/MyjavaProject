package control_Statements;

public class Switch_caseStatement {

	public static void main(String[] args) {
		
		System.out.println("Checking correct PIN of ATM");
		System.out.println("=================================");
		
		int PIN=2341;
		
		switch(PIN)
		{
		case 2134:
			System.out.println("Withdraw money\nBalance enquiry \nDeposit money");
			break;
		case 2534:
			System.out.println("Withdraw money\nBalance enquiry \nDeposit money");
			break;
		case 5134:
			System.out.println("Withdraw money\nBalance enquiry \nDeposit money");
			break;
		case 2341:
			System.out.println("Withdraw money\nBalance enquiry \nDeposit money");
			break;
		case 8734:
			System.out.println("Withdraw money\nBalance enquiry \nDeposit money");
			break;
			
			default:
			System.out.println("ATM WILL BE BLOCKED");
			
			}  
		
		
	}

}
