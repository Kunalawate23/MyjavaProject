package castingOR_Conversion;

public class Upcasting2 {

	public static void main(String[] args) {
		//At the time of upcasting the prop. which are
		//inherited from superclass are only eligible for upcasting
		
		Father f=new Son();
		f.home();
		f.farm();
	    //System.out.println(f.job);
		
	}

}
