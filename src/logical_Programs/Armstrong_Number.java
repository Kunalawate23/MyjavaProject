package logical_Programs;

public class Armstrong_Number {

	public static void main(String[] args) {
		
		int num=1634;
		int temp;
		int rev=0;
		int arms=num;
		
		while(num>0)
		{
			temp=num%10;
			rev=rev+temp*temp*temp*temp;
			num=num/10;
		}
		
		System.out.println(rev);
		
		if(rev==arms)
		{
			System.out.println(rev+" is a armstrong number");
		}
		else
		{
			System.out.println(rev+" is not a armstrong number");
		}

	}

}
