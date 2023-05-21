package collection;
import java.util.HashSet;


public class Hashset {

	public static void main(String[] args) {
		
		HashSet h=new HashSet();
		h.add("kunal");
		h.add(100);
		h.add('D');
        h.add(90.3);
        h.add(100);
        h.add(null);
        h.add(null);

        System.out.println(h);
        
        System.out.println(h.size());

        System.out.println(h.contains(100));
        
        h.remove(null);
        System.out.println(h);

    }

}
