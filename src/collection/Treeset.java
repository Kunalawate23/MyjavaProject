package collection;
import java.util.TreeSet;
public class Treeset {

	public static void main(String[] args) 
	{  
		TreeSet t=new TreeSet();
		t.add("a");
		t.add("F");
		//t.add(10); it takes only homogeneous elements
		t.add("D");
		t.add("K");
		t.add("Z");
		t.add("A");
		
		System.out.println(t);
		
		System.out.println(t.pollFirst());
		System.out.println(t.pollLast());
		
		 
		//t.add(10);
		//System.out.println(t);

	}

}
