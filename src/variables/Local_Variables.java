package variables;

public class Local_Variables {
	
	public void myMethod()
	{ // static int a=12; cannot use static keyword
	   //int a=10; cannot create duplicate variables
		//int d; no default values in local variables
	     
		 int a=19;
	     String b="kunal";
	     
	     System.out.println(a);
 	     System.out.println(b);
 	   	     
	     
		
	}

	public static void main(String[] args)
	{
		Local_Variables l=new Local_Variables();
		l.myMethod();
		
		
		
		
	}

}
