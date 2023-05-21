package encapsulation;

public class Juice {
	
	private String lemonjuice;
	
	public void setjuice(String a,String b,String c) 
	{
		this.lemonjuice=a=b=c;
		System.out.println("Lemon juice is ready");
	}
	
	public String getjuice() 
	{
	    return lemonjuice;	
	    
	}

}
