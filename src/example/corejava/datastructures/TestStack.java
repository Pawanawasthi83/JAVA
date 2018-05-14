package example.corejava.datastructures;

import java.util.Arrays;

public class TestStack {

	public static void main(String[] args) {
		
		Person per1 = new Person("Pawan", 12345);
		Person per2 = new Person("Awasthi", 797615);
		
		PersonStack perstack= new PersonStack(10);
		
		perstack.push(per1);
		perstack.push(per2);
		
		System.out.println(perstack.stack[1].name);

		Person pr = perstack.pop();
		
		System.out.println(pr.toString());
		
		
		
	}

}
