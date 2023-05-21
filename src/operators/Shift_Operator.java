package operators;

public class Shift_Operator {

	public static void main(String[] args) 
	{
		//Right Shift
				int q=25;
				System.out.println(q>>8);//(25/2^8)
				System.out.println(q>>67);//(25/2^5)
				
				System.out.println("====================");
		
				//Left shift		
				int b = 20;
				System.out.println(b<<5);// (20*2^5)
	}

}
