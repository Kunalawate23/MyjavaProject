package multi_level_Inheritance;

public class Mahindra_3 extends  Mahindra_2 {
	
	public void xuv300() 
	{
		System.out.println("Mahindra XUV300");
	}
	
	public void xuv700() 
	{
		System.out.println("Mahindra XUV700");
	}

	public static void main(String[] args) {
		 
		Mahindra_3 m=new  Mahindra_3();
		System.out.println("Mahindra Models");
		System.out.println("---------------");
		m.bolero();
		m.scorpio();
		m.thar();
		m.xuv500();
		m.xuv300();
		m.xuv700();
		


	}

}
