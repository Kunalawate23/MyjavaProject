package this_Keyword;

public class Invoke_Constructor {

	Invoke_Constructor()
	{  
		this(10);//invoked constructor by using this keyword
	    System.out.println("------------------------------------");
		System.out.println("I'm in non parameterized constructor");
		
	}
	Invoke_Constructor(int a)
	{
		
		System.out.println("I'm in parameterized constructor");
	}


	public static void main(String[] args) 
	{ 
		Invoke_Constructor i=new Invoke_Constructor();
	
		
		
	
		
	}

}
