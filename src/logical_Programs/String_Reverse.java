package logical_Programs;

public class String_Reverse {
	
	public static void main(String[]args)
	{
		String rev=" ";
		String str="IJAVIHS EJAR"; 
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		  System.out.println(rev);
	}
}
