package example.corejava.collections;

import java.util.TreeMap;

public class TestTreeMap {

	public static void main(String[] args) {
		
		TreeMap t1 = new TreeMap();
		t1.put(777, "Pawan");
		t1.put(555, "Anu");
		t1.put(555, "pawan");
		//t1.put("PPP", "OOO");//Supports only homogeneous data :ClassCastException
		//t1.put(null, "PP");//Null not allowed as Key.NullPointerException
		System.out.println(t1);//Sorted data with internal use of CompareTo()
		
		TreeMap t2 = new TreeMap(t1);
		t2.put(111, "Anu");
		t2.put(666, "IOJ");
		
		System.out.println(t2);
		

	}

}
