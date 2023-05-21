package exception_Handling;

public class Try_Finally_Block {

	public static void main(String[] args) {
		
		try
		{
			int a=5;
			int b=1;
			int c=a/b;
			System.out.println(c);
			
		}
		
		catch(Throwable e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Hi everyone");
		}
		
		  System.out.println("Kunal");
		  System.out.println("Awate");

	}

}
