package variables;

public class Static_Variables {
	static int a=34;
	static String s;
	static boolean b;
	static float f=678.13f;
	
	public static void display()
	{
        System.out.println(a);
        System.out.println(s);
        System.out.println(b);
        System.out.println(f);
	}
	
	public void show() 
	{
		    System.out.println(a);
	        System.out.println(s);
	        System.out.println(b);
	        System.out.println(f);   
	}

	public static void main(String[] args)
	{  
		display();
		System.out.println("-----------------");
		Static_Variables s=new Static_Variables();
		s.show();
		
	        
	
		
	}

}
