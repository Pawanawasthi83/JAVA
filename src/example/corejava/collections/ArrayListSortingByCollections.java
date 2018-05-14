package example.corejava.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortingByCollections {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Pawan");
		al.add("Sam");
		al.add("Ram");
		al.add("Anu");
		System.out.println("before sorting : "+al);
		Collections.sort(al);
		System.out.println("After sorting : "+al);

	}

}
