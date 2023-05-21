package string_Operation;

public class Demo {

	public static void main(String[] args) {
		String s1="KUnal Awate";
		String s2="kunal awate";
		String s3=" - Automation Tester";
		
		char c=s1.charAt(1);
		System.out.println(c);
		
		System.out.println(s1.endsWith("wate"));
		
		System.out.println(s1.startsWith("KUNAL"));
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println(s1.length());//starts from
		
		System.out.println(s1.isEmpty());
		
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1.indexOf('a'));
		
		System.out.println(s1.lastIndexOf('a'));
		
		System.out.println(s2.concat(s3));
		
		System.out.println(s1.substring(2));
		
		System.out.println(s1.substring(2, 8));
		
		System.out.println(s1.replace("KUnal", "Kunal"));
		
		


	}

}
