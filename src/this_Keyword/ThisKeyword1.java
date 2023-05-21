package this_Keyword;

public class ThisKeyword1 {
	int a;
	
	public void display(int z) 
	{
		System.out.println(z);
		this.a=z;//we can pass value of "z" to variable "a" by using this keyword that declared outside the method
	}
	public void show() 
	{
		System.out.println(a);//we can access instance and static variable in any method by using this keyword
		
	}

	public static void main(String[] args) 
	{ 
	  ThisKeyword1 t=new ThisKeyword1();
	  t.display(12);
	  t.show();

		
	}

}
