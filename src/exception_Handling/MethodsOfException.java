package exception_Handling;

public class MethodsOfException {

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
			System.out.println("-----");
			System.out.println(e);
			System.out.println("-----");
			System.out.println(e.getMessage());
		}

	}

}
