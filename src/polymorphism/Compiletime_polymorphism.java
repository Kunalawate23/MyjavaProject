package polymorphism;

public class Compiletime_polymorphism {
	
	public void multiply(int a,int b) 
	{
		System.out.println(a*b);
	}
	
	public void multiply(int e,int c ,int d) 
	{
		System.out.println(e*c*d);
	}
	
	public void multiply(int p,double d) 
	{
		System.out.println(p*d);
	}



	public static void main(String[] args) 
	{
		Compiletime_polymorphism c=new Compiletime_polymorphism();
		c.multiply(4, 7);
		c.multiply(3, 2, 6);
		c.multiply(8, 6.0);

	}

}
