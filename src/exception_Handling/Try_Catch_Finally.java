package exception_Handling;

public class Try_Catch_Finally {

	public static void main(String[] args) {
        
		try
		{
			int a=5;
			int b=0;
			int c=a/b;
			System.out.println(c);
		}
		
		catch(Throwable e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			System.out.println("program execution is completed");
		}

	}
	

}
