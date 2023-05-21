package operators;

public class LogicalOR_BitwiseOR {

	public static void main(String[] args)
	{
		int a=200;
		int b=132;
		int c=100;
		
		//Logical OR(||)
		
		System.out.println(a>c | a<b);
		System.out.println(a<c |c<b);
		System.out.println(c>b |a<c);
		
		System.out.println("===================================");
		
		//Bitwise OR(|)
		int p=12;
		int q=30;
		int r=67;
		
		System.out.println(p<r |q>p);
		System.out.println(r>p |p<q);
		System.out.println(p>r |r<q);
	}

}
