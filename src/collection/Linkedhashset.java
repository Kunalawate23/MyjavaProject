package collection;
import java.util.LinkedHashSet;
public class Linkedhashset {

	public static void main(String[] args) {
		
		LinkedHashSet l=new LinkedHashSet();
		l.add("peter");
		l.add(170);
		l.add('Y');
		l.add(90.8);
		l.add(null);
        l.add(null);
		l.add(170);
		
		System.out.println(l);

   }

}
