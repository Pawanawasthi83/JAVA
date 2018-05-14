package example.corejava.collections;

import java.util.Collections;
import java.util.LinkedList;

public class SortingLinkedListByCollections {

	public static void main(String[] args) {
		
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("Durga");
		l1.add("Anu");
		l1.add("Ratan");
		l1.add("Emy");
		
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);
	}

}
