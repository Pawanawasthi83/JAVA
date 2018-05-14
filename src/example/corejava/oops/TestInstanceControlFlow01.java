package example.corejava.oops;

public class TestInstanceControlFlow01 {

	int i=10;
	
	{
		m1();
		System.out.println("Parent Instance Block");
	}
	
	TestInstanceControlFlow01(){
		System.out.println("In side Parent Costructor");
	}
	public static void main(String[] args) {
		
		TestInstanceControlFlow01 t1 = new TestInstanceControlFlow01();
		
		System.out.println("Parent Main");
		
		
	}
	
	public void m1() {System.out.println(j);}
	
	{System.out.println("Second Instance Block");}
	
	int j=30;

}
