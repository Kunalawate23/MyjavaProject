package constructors;

public class Parameterized_constructors {

	Parameterized_constructors(int a)
	{
		System.out.println("one argument with integer");
	}
	Parameterized_constructors(String b)
	{
		System.out.println("one argument with string");
	}
	Parameterized_constructors(String b,int c)
	{
		System.out.println("Two argument with string and integer");
	}

	
	    public static void main(String[] args) 
	{
		
		new Parameterized_constructors(10); //pass int_eger data
		System.out.println("------------------");
		
		new Parameterized_constructors("kunal");
		System.out.println("--------------------"); // pass string data
		
		new Parameterized_constructors("akshay",19); //pass string and integer data
		
	}

}
