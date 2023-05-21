package control_Statements;

public class Nested_Ifelse {

	public static void main(String[] args)
	{ 
	  System.out.println("positive,even-odd or negative");	
	  System.out.println("===============================");
	  int a=50;
	  if(a>0)
	 {
		  System.out.println("Number is positive");
	  
	  if(a%2==0)
	  {
		  System.out.println("number is even");
	  }
	  else
	  {
		  System.out.println("Number is odd");
	  }
	 }
	  else 
	  {
		  System.out.println("Its a negative number");
	  }

	}

}
	

