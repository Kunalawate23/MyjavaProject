package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class List {
	
	public static void main(String args[])
	{
		System.out.println("Arraylist");
		ArrayList a=new ArrayList();
		a.add(22);
		a.add(7);
		a.add(98);
		a.add('k');
		a.add('u');
		
		System.out.println(a);
		System.out.println(a.get(2));
		
		a.set(3,'p');
		System.out.println(a);
		
		a.remove(3);
		System.out.println(a);
		
		System.out.println(a.isEmpty());
		
		a.clear();
		System.out.println(a);
		
		a.add("KUNAL");
		System.out.println(a);
	
		System.out.println("-------------------------------");
		
		System.out.println("LinkedList");
		
		LinkedList l=new LinkedList();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		l.add(500);
		
		System.out.println(l.size());
		System.out.println(l.get(2));
		
		l.set(4,700);
		System.out.println(l);
		
		l.remove(3);
		System.out.println(l);
		
		System.out.println(l.contains(100));
		
		System.out.println(l.isEmpty());
		
		l.clear();
		System.out.println(l);
		
		
		System.out.println("------------------------------------");
		System.out.println("Hashset_");
		
		HashSet h=new HashSet();
		h.add("Kunal");
		h.add(100);
		h.add("Kuna");
		System.out.println(h);
		
		System.out.println("--------------------------------");
		System.out.println("Linkedhashset");
		
		LinkedHashSet lh=new LinkedHashSet();
		lh.add("Kunal");
		lh.add(170);
		lh.add('Y');
		lh.add(170);
		lh.add(null);
		lh.add(null);
		
		System.out.println(lh);
		
		System.out.println("------------------------------------");
		System.out.println("Treeset");
		
		TreeSet t=new TreeSet();
		t.add('t');
		t.add('i');
		t.add('g');
		
		System.out.println(t);
		System.out.println(t.pollFirst());
		System.out.println(t.pollLast());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
