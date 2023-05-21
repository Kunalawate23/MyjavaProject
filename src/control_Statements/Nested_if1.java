package control_Statements;

public class Nested_if1 {

	public static void main(String[] args) {
		System.out.println("welcome to blood donation camp");
		
		System.out.println("==============================");
		int age=16;
		int weight=45;
		
		
		if(age>18)
		
	 {
			System.out.println("condition 1 is satisfied");
		
	   if(weight>=45)
	   {
		   System.out.println("condition 2 is satisfied");
		   System.out.println("You can donate blood here");
	   }
     }
		else
		{
			System.out.println("You cannot donate blood here");
		}
	   
		

	}

}
