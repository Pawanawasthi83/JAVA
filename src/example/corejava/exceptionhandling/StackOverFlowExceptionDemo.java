package example.corejava.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class StackOverFlowExceptionDemo {

	
	
	public static void m1() {
		m2();
	}
	public static void m2() {
		m1();
	}
	public static void main(String[] args) throws FileNotFoundException {
		//FileInputStream fis = new FileInputStream("Pawan.txt");
		m1();

	}

}
