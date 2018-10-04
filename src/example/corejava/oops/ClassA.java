package example.corejava.oops;

import java.lang.reflect.Method;

public class ClassA {

	public ClassA() {
		//System.out.println("Class A counstructor");
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class c = Class.forName("example.corejava.oops.ClassB");
		Method[] m = c.getDeclaredMethods();
		for(Method m1:m){
			System.out.println(m1.getName());
		}
		
		String str = new String("Pawan");
		
		System.out.println(String.class.getClassLoader());
		System.out.println(ClassB.class.getClassLoader());
		
	}
public void finalize() {
		
		System.out.println("Finalize Method Call from ClassA class");
	}
	
}


