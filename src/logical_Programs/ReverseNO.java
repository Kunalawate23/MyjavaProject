package logical_Programs;

public class ReverseNO {

	public static void main(String[] args) {
		
		int num=987654;
		int rev=0;
		int rem;
		
		while(num!=0) 
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		
		System.out.println("Reverese number is:"+rev);

	}

}
