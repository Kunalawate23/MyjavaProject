package logical_Programs;

public class Find_Factorial {

	public static void main(String[] args) 
	{
		System.out.println("Find factorial of given Number ");
		System.out.println("================================");
		
		int a=4;
		int fact=1;
		
		
		for(int i=1;i<=a;i++)//1<=4..2<=4..3<=4..4<=4..5<=4 false
		{
			fact=fact*i; //fact=1*1..1*2..1*3..1*4..
		}
		System.out.println(fact);
	}

}
