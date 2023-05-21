package logical_Programs;

public class Swap2Number {

	public static void main(String[] args) {
		  int a=10;
		  int b=20;
		  int c;
		  
		  System.out.println(a+"<--Before swap-->"+b);
		  
		  c=b;//c=20
		  b=a;//a=10
		  a=c;//c=20
		  System.out.println("--------------------");
		  System.out.println(a+"<--After swap-->"+b);

	}

}
