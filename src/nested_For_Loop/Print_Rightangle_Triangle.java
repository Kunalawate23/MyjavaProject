package nested_For_Loop;

public class Print_Rightangle_Triangle {

	public static void main(String[] args) {
		System.out.println("Print Right angle Triangle using *");
		System.out.println("==================================");
		
		for(int i=1;i<=5;i++)//1<=5 true,2<=5 true,
		{
			for(int j=1;j<=i;j++) 
				
			{
				System.out.print("*");
			}
		         System.out.println();
		}
		
		

	}

}
