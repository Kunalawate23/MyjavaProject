package exception_Handling;
import java.io.File;
import java.io.FileReader;


public class MultipleCatchBlock {

	public static void main(String[] args) {
		
		try
		{
		  int a=5;
		  int b=0;
		  int c=a/b;
		  System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("111");
		}
		catch(Throwable e)
		{
			e.printStackTrace();
			System.out.println("222");
		}

	}

}
