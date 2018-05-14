package example.corejava.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListListIteratorOperations {

	public static void main(String[] args) {
		
		ArrayList<Emp> list = new ArrayList<Emp>();
		list.add(new Emp(111, "Pawan"));
		list.add(new Emp(222, "Durga"));
		list.add(new Emp(333, "John"));
		list.add(new Emp(777, "Alfha"));
		list.add(new Emp(999, "Beta"));
		
		ListIterator<Emp> ltr = list.listIterator();
		
		//hasNext() Returns true if the iteration has more elements
		while(ltr.hasNext())
		{
			// nextIndex() Returns the next element index 
			System.out.println(ltr.nextIndex());
			// next() Returns the next element in the iteration.
			//It throws NoSuchElementException if no more element present
			
			Emp e = ltr.next();
			if(e.eid==777){
				ltr.set(new Emp(666, "Hero"));
				ltr.add(new Emp(444,"Hello"));
			}
			System.out.println(e.eid+"--"+e.ename);
		}
		
		//hasPrevious() Returns true if the iteration has more elements
		// while traversing backward
		while(ltr.hasPrevious())
		{
			System.out.println("======" + ltr.previousIndex());
			// previous() Returns the previous element in the iteration
			Emp e = ltr.previous();
			System.out.println(e.eid+"----"+e.ename);
		}
		
	}

}
