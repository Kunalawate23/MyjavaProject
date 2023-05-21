package operators;

public class LogicalAND_BitwiseAND {

	public static void main(String[] args) 
	{//Logical AND (&&)
		//1.It will not check second condition if first condition is false.
		//2.It checks second condition only when first condition is true.	
		
				
				int x= 30;
				int y=21;
				System.out.println(x>y && x<y);//false
				System.out.println(y<x && x>y);//True
				System.out.println(y<x && x>y);//True
				
				System.out.println("====================================");
				
			//Bitwise AND(&)
			//It always check both conditions whether first condition is true or false
				
			int p=30;
			int q=89;
			
			System.out.println(p>q & p<q);
			System.out.println(q>p & p<q);
			System.out.println(p<q & q>p);
		

	}

}
