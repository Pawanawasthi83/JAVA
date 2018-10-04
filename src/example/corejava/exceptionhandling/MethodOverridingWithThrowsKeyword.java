package example.corejava.exceptionhandling;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

class XXX{
	public void methodOne() throws EOFException{
		System.out.println("In Side Method One");
	}
}



public class MethodOverridingWithThrowsKeyword extends XXX{

	public void methodOne() throws EOFException {
		System.out.println("In Side Sub Class Method");
	}
	public static void main(String[] args) throws EOFException {
		
		XXX x = new XXX();
		x.methodOne();
		
		XXX x1 = new MethodOverridingWithThrowsKeyword();
		x1.methodOne();
	}

}
