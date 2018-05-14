package example.corejava.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		
		TreeSet t1 =new TreeSet();
		t1.add("Durga");
		t1.add("Amit");
		t1.add("Alo");
		//t1.add(null);//NullPointerException
		//t1.add(10); //Class cast Exception 
		
		System.out.println(t1);
		
		TreeSet t2 =new TreeSet();
		t2.add(10);
		t2.add(5);
		t2.add(7);
		t2.add(1);
		
		System.out.println(t2);
		
		TreeSet<StringBuffer> treeSet = new TreeSet<StringBuffer>(new MyComparator());
		
		StringBuffer sf1 = new StringBuffer("Durga");
		StringBuffer sf2 = new StringBuffer("Anu");
		StringBuffer sf3 = new StringBuffer("Emi");
		
		treeSet.add(sf1);
		treeSet.add(sf2);
		treeSet.add(sf3);
		
		System.out.println(treeSet);
	}

}
class MyComparator implements Comparator<StringBuffer>{

	@Override
	public int compare(StringBuffer sf1, StringBuffer sf2) {
		String s1 = sf1.toString();
		String s2 = sf2.toString();
		return s1.compareTo(s2);
	}
	
}
