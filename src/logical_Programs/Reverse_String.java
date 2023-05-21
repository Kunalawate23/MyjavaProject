package logical_Programs;

public class Reverse_String {

	public static void main(String[] args) {
		
		String reverse=" ";
		String str="KUNAL";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);//reverse=LANUK
		}
		
		System.out.println(reverse);
		
		
	}

}
