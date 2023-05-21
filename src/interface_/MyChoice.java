package interface_;

public class MyChoice {

	public static void main(String[] args) 
	{
		System.out.println("Im entering in Hall");
		Hall h=new Hall();
		h.tubeLightInHall();
		h.tubeLightInKitchen();
		
		System.out.println("----------------------");
		
		System.out.println("Im entering in Kitchen");
		Tubelight t=new Kitchen();
		t.tubeLightInHall();
		t.tubeLightInKitchen();

	}

}
