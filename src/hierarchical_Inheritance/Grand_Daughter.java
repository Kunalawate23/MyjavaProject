package hierarchical_Inheritance;

public class Grand_Daughter extends Grandfather {
	
	public void fair()
	{
		System.out.println("Grand Daughter has fair skin");
	}

	public static void main(String[] args) {
		
		Grand_Daughter g=new Grand_Daughter();
		g.blue_Eyes();
		g.curly_Hairs();
		g.fair();
	}

}
