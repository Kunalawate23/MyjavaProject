package exception_Handling;

import java.io.FileInputStream;
public class Try_CatchBlock {

	public static void main(String[] args) {
		
		try
		{
			FileInputStream f=new FileInputStream("D:/kunal.txt");
			
		}
		
		catch(Throwable e)
		{
		    e.printStackTrace();
		}

	}

}
