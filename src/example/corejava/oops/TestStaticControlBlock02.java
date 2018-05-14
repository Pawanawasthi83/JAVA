package example.corejava.oops;

public class TestStaticControlBlock02 extends TestStaticControlBlock01 {

	static int x = 20;

	static{
		m2();
		System.out.println("In side child First Static Block");
	}
	
	public static void main (String args[]) {
		m2();
		System.out.println("In side Child main");
	}
	
	public static void m2() {
		System.out.println(y);
			
	}
	
	static int y=200;

}
