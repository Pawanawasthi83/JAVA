package example.corejava.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SortingLinkedListByComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Manager> ll = new LinkedList<Manager>();
		ll.add(new Manager(111, "Durga"));
		ll.add(new Manager(111, "Pawan"));
		ll.add(new Manager(555, "Ratan"));
		ll.add(new Manager(777, "John"));
		ll.add(new Manager(222, "Geeta"));
				
		Collections.sort(ll, new MyClassManagerID());
		
		Iterator<Manager> itr = ll.iterator();
		
		System.out.println(ll);
		
		while (itr.hasNext()) {
			Manager mm = itr.next(); 
			System.out.println(mm.managerId+"__"+mm.managerName);
		}
	}
}

class MyClassManagerName implements Comparator<Manager>
{

	@Override
	public int compare(Manager m1, Manager m2) {
		// TODO Auto-generated method stub
		return m1.managerName.compareTo(m2.managerName);
	}
	
}

class MyClassManagerID implements Comparator<Manager>
{

	@Override
	public int compare(Manager m1, Manager m2) {
		if(m1.managerId==m2.managerId){
			return 0;
		}else if(m1.managerId>m2.managerId){
			return 1;
		}else{
			return -1;
		}
	}
	
}


