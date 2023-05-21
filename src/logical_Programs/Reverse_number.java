package logical_Programs;

public class Reverse_number {

	public static void main(String[] args) 
	{
		
		int num=321;
		int temp;
		int rev=0;
		
		
		while(num>0) 
		{
			temp= num%10;
			rev=rev*10+temp;
			num=num/10;
		}
		  System.out.println(rev);
	}
}
