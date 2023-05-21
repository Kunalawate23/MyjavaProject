package logical_Programs;

public class Check4Prime {

	public static void main(String[] args) 
	{  
	   System.out.println("Check given number is prime or not");
	   System.out.println("==================================");
		
	   int a=4;
	   int temp=0;
	   
	   for(int i=2;i<=a-1;i++)//(2<=3..3<=3.. true 4<=3 false)
	   {
		   if(a%i==0) //(4%2..true   4%3 false)
		   {
			   temp=1;
			   
		   }
	   }
	   
	    if(temp==0) 
	    {
	    	System.out.println(a+" is prime number");
	    }
	    else
	    {
	    	System.out.println(a+" is not prime number");
	    }
		

	}

}
