package example.corejava.oops;

public class TestOverLoadingAutoPromotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		
		t.m1(10);
		t.m1(10.5f);
		t.m1('a');
		t.m1(10l);
		t.m1(10.5);
		t.m1(new Object());
		t.m1("Pawan");
		t.m1(new StringBuffer("Pawan"));
		
		
	}

}

class Test{
	
	public void m1(int i) {
		System.out.println("Int-Args");
	}
	
	public void m1(float i) {
		System.out.println("float-Args");
	}
	
	public void m1(String i) {
		System.out.println("String-Args");
	}
	public void m1(Object o) {
		System.out.println("Object-Args");
	}
	public void m1(StringBuffer o) {
		System.out.println("String Buffer-Args");
	}
}
