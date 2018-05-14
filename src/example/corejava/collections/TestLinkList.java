package example.corejava.collections;

import java.util.Collections;
import java.util.LinkedList;

public class TestLinkList {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("A");
		ll.add("B");
		ll.add("C");
		ll.add("D");
		System.out.println(ll);
		ll.addFirst("anu");
		ll.addLast("Ratan");
		System.out.println(ll);
		ll.add(2,"pawan");
		System.out.println(ll);	
		
		ll.remove("A");
		System.out.println(ll);
		ll.remove(3);
		System.out.println(ll);
		
		System.out.println(ll.isEmpty());
		LinkedList<String> aa = new LinkedList<String>(ll);
		//aa.addAll(ll);
		aa.add("P1");
		aa.add("P2");
		
		
		System.out.println(aa);
		Collections.sort(aa);
		System.out.println(aa);

	}

}
