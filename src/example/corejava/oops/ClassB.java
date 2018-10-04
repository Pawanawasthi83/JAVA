package example.corejava.oops;

public class ClassB extends ClassA {

	public ClassB() {
		System.out.println("Class B :: Construstor");
	}
	
	public void M1 () {
		System.out.println("Inside M1");
	}
	public static void main(String[] args) {

		ClassA a = new ClassA();
		ClassB b = new ClassB();
	}

}
