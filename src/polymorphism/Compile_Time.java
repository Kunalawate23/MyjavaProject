package polymorphism;

public class Compile_Time {
	
    // Method Overloading
	
	public static void car(int p)
	{
		System.out.println("Ford Endeavour");
	}
	public static void car(char c)
	{
		System.out.println("Fortuner");
	}

	public static void car(int p,char b)
	{
		System.out.println("Breeza");
	}


	public static void main(String[] args) {
		
		Compile_Time.car(33);
		Compile_Time.car('T');
		Compile_Time.car(13,'S');
		
		

	}

}
