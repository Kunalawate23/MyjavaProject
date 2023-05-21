package this_Keyword;

public class With_ThisKeyword {
	 int b;//instance variable
     String d;
     public void display(int a,String s) //local variable
     {
   	 System.out.println(a); 
   	 System.out.println(s);
   	  
   	  this.b=a;
   	  this.d=s;
     }
     
     public void show() 
     {
   	  System.out.println(b);
   	  System.out.println(d);
   	 }

	public static void main(String[] args)
	{ With_ThisKeyword w=new With_ThisKeyword();
	  w.display(50,"Kunal");
	  System.out.println("---------------------");
	  w.show();
		
	}

}
