package nested_For_Loop;

public class Print_pyramid {

	public static void main(String[] args) {
		
		System.out.println("print pyramid using Nested for loop");
		System.out.println("===================================");
		
		for (int i=0; i<6; i++) //0<6 true,1<6 true,2<6 true,3<6 true,4<6 true
	  {  
		//inner loop work for space      
		for (int j=6-i; j>1; j--) //6>1 true,5>1 true,4>1 true,3>1 true
		{  
		//prints space between two stars  
		System.out.print(" ");//print space1,2,3,4
		}   
		//inner loop for columns  
		for (int j=0; j<=i; j++ )   
		{   
		//prints star      
		System.out.print("k ");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();

	  }

	}
}
