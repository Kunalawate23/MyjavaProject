package collection;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
	
		ArrayList a=new ArrayList();
		a.add("Kunal");
		a.add("Awate");
		a.add("BBA-CA");
        a.add(22);
		a.add(7);
		a.add(98);
		a.add(null);
		a.add(null);
		
		System.out.println(a);
		
		System.out.println(a.size());
		System.out.println(a.get(2));
		
		a.set(2,"AK");
		System.out.println(a);
		
		a.remove(4);
		System.out.println(a);
		
		System.out.println(a.contains('K'));
		
		System.out.println(a.isEmpty());
		
		a.clear();
		System.out.println(a);
		
		
		
		
		
	}

}
