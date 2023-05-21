package inheritance;

public class Honda extends Hero {
	
	public void shine()
	{
		System.out.println("Honda ltd.shine");
	}
	public void unicorn() 
	{
		System.out.println("Honda ltd.Unicorn");
	}

	public static void main(String[] args) 
	{
		 Honda h=new Honda();
		 System.out.println("Call to super class");
		 System.out.println("===================");
		 h.splendor();
		 h.hf_Deluxe();
		 System.out.println("------------------------------");
		 System.out.println("Call to sub class");
		 System.out.println("===================");
		 h.shine();
		 h.unicorn();
	}

}
