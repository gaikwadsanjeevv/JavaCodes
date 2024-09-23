package oops1;

public class StaticVaribleImplement {
	
	static String UniName = "UCM";
	public static void main(String[] args) {
		StaticVaribleImplement object1 = new StaticVaribleImplement();
		StaticVaribleImplement object2 = new StaticVaribleImplement();
		StaticVaribleImplement object3 = new StaticVaribleImplement();
		System.out.println("Object1 x = "+object1.UniName);
		System.out.println("Object2 x = "+object2.UniName);
		System.out.println("Object3 x = "+object3.UniName);
		
		System.out.println("access by class name : "+StaticVaribleImplement.UniName);
	}
}
