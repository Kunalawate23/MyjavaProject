package this_Keyword;

public class Invoke_method {
	
    public void invokeMethod() 
	{
	    System.out.println("Im in invoke Method");
	}
	
	public void show() 
	{    
		invokeMethod();
		System.out.println("------------------------------------");
		System.out.println("Im in show method");
	}

	public static void main(String[] args) 
	{
		Invoke_method i=new Invoke_method();
		i.show();
	}

}
