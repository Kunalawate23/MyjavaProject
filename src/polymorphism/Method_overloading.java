package polymorphism;

public class Method_overloading {
	
	public void fruit(int a) 
	{
		System.out.println("I like mango");
	}

	public void fruit(char c) 
	{
		System.out.println("I like Apple");
	}

	public void fruit(double d, String s) 
	{
		System.out.println("I like orange");	
	}

	public static void main(String[] args) {
		
		Method_overloading m=new Method_overloading();
		m.fruit(3);
		m.fruit('f');
		m.fruit(43.1,"kunal");
		

	}

}
