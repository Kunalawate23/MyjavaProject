package polymorphism;

public class Runtime_2 extends Runtime_1 {
	
	public void bike() 
	{
		System.out.println("I want to buy Duke");
	}
    public void bike(int r) 
    {
    	System.out.println("I want to buy Royal Enfield");
	}

	public static void main(String[] args) {
		System.out.println("Bike collection");
		System.out.println("----------------");
		
		Runtime_1 r=new Runtime_1();
		r.bike();
		r.bike(600000);
		System.out.println("----------------");
		Runtime_2 s=new Runtime_2();
		s.bike();
		s.bike(250000);
		
		
		
		
		

	}

}
