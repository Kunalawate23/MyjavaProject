package nested_For_Loop;

public class Right_Angle {

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)//(1<=5 true,2<=5 true,3<=5 true,4<=5 true,5<=5 true,6<=5 false
		{
			for(int j =1;j<=i;j++)//(1<=1 true,1<=2 true,1<=3 true,1<=4 true,1<=5 true
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
