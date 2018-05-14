package example.corejava.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class SortTreeMapWithComparator {

	public static void main(String[] args) {
		
		TreeMap t = new TreeMap(new MyEmpComp());

		t.put(new Emp(222,"Pawan"), "XXX");
		t.put(new Emp(777,"Gurga"), "YYY");
		t.put(new Emp(444,"Ambi"), "ZZZ");
		
		System.out.println(t);
		
		Set s = t.keySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()){
			Emp e = (Emp)itr.next();
			System.out.println(e.eid+"---"+e.ename);
		}
	}
}

class MyEmpComp implements Comparator<Emp>{

	@Override
	public int compare(Emp e1, Emp e2) {
		// TODO Auto-generated method stub
		return (e1.ename).compareTo(e2.ename);
	}

}
