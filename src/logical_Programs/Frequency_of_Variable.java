package logical_Programs;

public class Frequency_of_Variable {

	public static void main(String[] args) {
		
		int counter=0;
		String str="I LOVE MY COUNTRY";
		char freq='Y';
		
		for(int i=0;i<=str.length()-1;i++)
		{
			if(freq==str.charAt(i));//Y==Y
			counter ++;
		}
		System.out.println("Frequency of "+freq+"="+counter);

	}

}
