package example.corejava.oops;

import java.lang.reflect.Method;

public class TestOverloadingConstructor {

	TestOverloadingConstructor() {

		this(10);
		System.out.println("In side first");
	}

	TestOverloadingConstructor(int i) {

		this(10.5);
		System.out.println("In side int args");
	}

	TestOverloadingConstructor(double j) {

		System.out.println("In side double args");
	}

	
	public static void main(String[] args) throws ClassNotFoundException {
	
		TestOverloadingConstructor t1 = new TestOverloadingConstructor();
		
		TestOverloadingConstructor t2 = new TestOverloadingConstructor(10);
		
		TestOverloadingConstructor t3 = new TestOverloadingConstructor(10.5);
		
		Class c = Class.forName("TestOverloadingConstructor");
		Method[] m = c.getDeclaredMethods();
		for(Method m1:m){
			System.out.println(m1.getName());
		}
	}

}
