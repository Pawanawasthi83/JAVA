package example.corejava.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		
//		Only forward direction iterating is possible.
//		Replacement and addition of new element is not supported by Iterator.
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Pawan");
		al.add("John");
		al.add("Hello");
		al.add("Ram");
		al.add("Durga");
		
//		Normal Version of iterator
//		Iterator itr1 = al.iterator();
//		
//		while(itr1.hasNext()){
//			
//			System.out.println(itr1.next());
//		}
		
		//Generic Version of iterator
		Iterator<String> itr2 = al.iterator();
		
		while(itr2.hasNext()){
			String element = itr2.next();
			System.out.println(element);
			//This method can be called only once per call to next(). 
			//The behavior of an iterator is unspecified if the underlying collection 
			//is modified while the iteration is in progress in any way other than by calling this method.
			itr2.remove();
			
			
		}
		System.out.println(al);
	}

}
