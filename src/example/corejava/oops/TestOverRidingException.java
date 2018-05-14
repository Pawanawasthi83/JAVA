package example.corejava.oops;

import java.io.EOFException;
import java.io.IOException;

public class TestOverRidingException {

	public static void main(String[] args){
		
		//P p = new C();
		//p.m1();

	}

}

class P{

	public void m1() throws IOException, InterruptedException {
		System.out.println("Method From P classs");
	}
	
}

class C extends P{
	
	public void m1() throws EOFException,InterruptedException {
		System.out.println("Method from Child class");
	}
}