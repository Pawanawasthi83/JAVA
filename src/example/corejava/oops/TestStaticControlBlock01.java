package example.corejava.oops;

public class TestStaticControlBlock01 {

	static int i=10;
	static{
		m1();
		System.out.println("First Static Block from Parent");
	}
	public static void main(String[] args) {
		
		m1();
		
		System.out.println("Main Method from parent class");

	}
	
	public static void m1() {
		
		System.out.println(j);
	}
	
	static{
		System.out.println("Second Static Block in parent");
	}
	
	public static int j = 20;
}
