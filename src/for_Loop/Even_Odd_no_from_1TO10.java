package for_Loop;

public class Even_Odd_no_from_1TO10 {

	public static void main(String[] args) {
		
		System.out.println("Print all even and odd number from 1 To 10");
		System.out.println("==========================================");
		
		System.out.println("Even numbers from 1 To 10");
		
		 for(int i=1;i<=10;i++)
		 
		 {	 
		   if(i%2==0)
			{   
			  System.out.println(i);
			}
		   
		 }
		
		 System.out.println("==================");
		 System.out.println("Odd numbers from 1 To 10"); 
		
		 for(int i=1;i<=10;i++)
		 {
		  if(i%2==1)
		   {   
		      System.out.println(i);
		   }
		 
		 }
		 
	}

}
