package interface_;

public class ColdCoffee implements Milk,Sugar,Coffee,ChocolateIcecream,Ice,Cocopowder 
{

	public static void main(String[] args) 
	
	{   System.out.println("How to make Cold Coffee -");
		System.out.println("-------------------------");
	    ColdCoffee c=new ColdCoffee();
		c.addMilk();
		c.addcoffee();
		c.addSugar();
		c.addIce();
		c.addCocopowder();
		c.addChocolateIcecream();
	}

	
	public void addCocopowder() 
	{
		System.out.println("Add cocopowder for garnishing");
		
	}

	
	public void addIce() 
	{
		System.out.println("Add Ice and now blend it in mixer");
		
	}

	
	public void addChocolateIcecream() 
	{
		System.out.println("Add chocolate ice cream");
		System.out.println("Ready to serve");
		
	}

	
	public void addcoffee()
	{
		
		System.out.println("Add a teaspoon of coffee powder in milk  ");
	}

	public void addSugar() 
	{
		System.out.println("Add 2 teaspoon of sugar in it");
		
	}

	
	public void addMilk() 
	{
		
		System.out.println("Take a glass of milk");
	}

}
