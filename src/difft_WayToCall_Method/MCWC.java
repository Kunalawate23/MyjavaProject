package difft_WayToCall_Method;

public class MCWC {
	
	public static void amazon() 
	{
	     System.out.println("Will buy laptop");	
	}
	public void flipkart() 
	{
		 System.out.println("will buy washing machine");		
	}

	public static void main(String[] args) 
	{ 
	   MCWC.amazon();
	   System.out.println("-----------------------------");
	   MCWC m=new MCWC();
	   m.flipkart();
		
	}

}
