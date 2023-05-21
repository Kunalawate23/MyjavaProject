package control_Statements;

public class If_ElseIf {

	public static void main(String[] args) 
	{
		int money = 500;
		
		if(money>5000 && money<=10000)
		{
			System.out.println("I will buy watch");
		}
		else if(money>10000 && money<=20000)
		{
			System.out.println("I will buy mobile");
		}
		else if(money>20000 && money<=50000)
		{
			System.out.println("I will buy Smart TV");
		}
		else
		{
			System.out.println("Insufficient Money");
		}
		

	}

}
