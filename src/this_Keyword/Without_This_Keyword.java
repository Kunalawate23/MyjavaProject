package this_Keyword;

public class Without_This_Keyword {
	int e;
	String h;
	
	public void keyword(int a,String b) 
	{   
		 System.out.println(a);
		 System.out.println(b);
		 e=a;
	     h=b;
	}
	
	public void keyword1() 
	{
		 System.out.println(e);
		 System.out.println(h);
	}

	public static void main(String[] args) 
	{
		Without_This_Keyword w=new Without_This_Keyword();
		w.keyword(23,"kunal");
		System.out.println("------------------------------");
		w.keyword1();
		

	}

}
