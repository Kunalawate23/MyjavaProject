package logical_Programs;

public class Fibonacci_Series {

	public static void main(String[] args) 
	{
		System.out.println(" Fibonacci Series ");
		System.out.println("==============================");
		
		int a=0;
		int b=1;
		int c=0;
		
		System.out.print(a+" "+b); // 0<20..1<20..2<20
		
		
		while(c<30) //c=0+1=1..(1=1=2)..(1+2=3)
		
		{
			c=a+b;
			System.out.print(" "+c); //
			
			a=b; //a=1..a=1
			b=c; //b=1..b=2
		}
		

	}

}
