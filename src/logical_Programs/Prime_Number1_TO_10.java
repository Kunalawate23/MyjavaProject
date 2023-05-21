package logical_Programs;

public class Prime_Number1_TO_10 {

	public static void main(String[] args) {
	
	System.out.println("prime number from 1 to 10");
	System.out.println("==========================");
	
		
		int flag=0;
		
		for(int i=2;i<=10;i++)//2<=10
		{ 
			for(int j=2;j<i;j++)//2<2
			{
				if(i%j==0)
				{
				 flag=1;	
				}
			}
			
			if(flag==0) 
			{
			  System.out.println(i+" Number is prime");
			}
			else
			{
				flag =0;
			}
			
		}
		
		
	}

}
