package example.corejava.oops;


public class TestOverRidingStaticMethod {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		A a = new A();
		a.A1();//parent
		
		B b = new B();
		
		b.A1();//Child
		
		A a1 = new B();
		a1.A1();//Parent
		
	}

}

class A{
	
	public static void A1(){
		System.out.println("Parent");
	}
	
}

class B extends A{
	
	public static void A1() {
		System.out.println("Child class");
	}
}
