package polymorphism;

public class Runtime_Polymorphism2 extends Runtime_Polymorphism1  {
	
	public void eat() 
	{
		System.out.println("I like Apple");
	}

	public static void main(String[] args) {
		
		Runtime_Polymorphism2 r2=new Runtime_Polymorphism2();
		r2.eat();
		
		System.out.println("-------------");
		Runtime_Polymorphism1 r1=new Runtime_Polymorphism1();
		r1.eat();
		

	}

}
