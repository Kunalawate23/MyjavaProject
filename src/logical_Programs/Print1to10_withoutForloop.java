package logical_Programs;

public class Print1to10_withoutForloop {
	
	public void mymethod(int a)
	{
		if(a<=10)
		{
			System.out.println(a);
			mymethod(a+1);
		}
		
	}
       public static void main(String[] args)
	{
		Print1to10_withoutForloop p=new Print1to10_withoutForloop();
		p.mymethod(1);
		
	}

}
