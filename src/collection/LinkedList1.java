package collection;

import java.util.LinkedList;
public class LinkedList1 {

	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		l.add(100);
		l.add("kunal");
		l.add('K');
		l.add(100);
		l.add(null);
		l.add(null);
		
		System.out.println(l);
		
		System.out.println(l.size());
		
		System.out.println(l.get(2));
		
		l.set(3, "Awate");
		System.out.println();
		
		l.remove(4);
		System.out.println(l);
		
		System.out.println(l.contains('K'));
		
		System.out.println(l.isEmpty());
		
		l.clear();
		System.out.println(l);
		
	}

}
