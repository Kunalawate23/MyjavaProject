package variables;

public class Instance_Variable {
	int a=89;
	String b;
	boolean c;
	public static void display() 
	{
		//System.out.println(a); Instance variable cannot access in static method
		System.out.println("Instance variable cant access in static method");
	}   
	public void show() 
	{ 
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
	public static void main(String[] args)
	{ 
		Instance_Variable.display();
		System.out.println("----------------------");
		Instance_Variable i=new Instance_Variable();
		i.show();
		
		

	}

}
