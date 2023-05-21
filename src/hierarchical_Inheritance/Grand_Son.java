package hierarchical_Inheritance;

public class Grand_Son extends Grandfather {
	
	public void height() 
	{
		System.out.println("Grandson has long Height");
	}
	
    

	public static void main(String[] args) {
		
		Grand_Son g=new Grand_Son();
		g.blue_Eyes();
		g.curly_Hairs();
		g.height();

	}

}
