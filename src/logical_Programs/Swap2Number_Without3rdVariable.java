package logical_Programs;

public class Swap2Number_Without3rdVariable {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		System.out.println("Before swap "+a+"--------"+b);
        
		a=a+b; //a=10+20=30
		b=a-b; //b=a-b=10
		a=a-b; //a=30-10=20
		
		System.out.println("After swap "+a+"----------"+b);
		
	}

}
