package control_Statements;

public class Nested_IF {

	public static void main(String[] args) 
	{
	
		System.out.println("Voting Rules of India");
		System.out.println("============================");
		
		int age=15;
		String Nationality="African";
		
		if(age>=18)
		{
			System.out.println("condition 1 satisfied");
		
		  if(Nationality =="Indian")
		  {
			  System.out.println("condition 2 satisfied");
			  System.out.println("You are eligible for voting");
		  }
		}
		else
		{
			System.out.println("You are not eligible for voting");
		}
		
		
		

	}

}
