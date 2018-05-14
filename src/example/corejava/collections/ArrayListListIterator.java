package example.corejava.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListListIterator {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Pawan");
		al.add("John");
		al.add("Hello");
		al.add("Ram");
		
		ListIterator<String> lstr = al.listIterator();
		
		while(lstr.hasNext()){
			
			System.out.println(lstr.next());
		}
		
		while(lstr.hasPrevious()){
			
			System.out.println(lstr.previous());
		}
		
	}

}
