package difft_WayToCall_Method;

public class MCAWC {
	
	public static void mobile(int a) 
	{
		System.out.println("I like i phone");
	}
	public void laptop(String b) 
	{
		System.out.println("I like MACbook");
	}
	public void radio(int c,String x)
	{
		System.out.println("I like saregama Carava");	
	}

	public static void main(String[] args) 
	{
		MCAWC.mobile(12);
		System.out.println("----------------");
		MCAWC m=new MCAWC();
		m.laptop("HP");
		System.out.println("----------------");
		m.radio(5600,"sony");

	}

}
