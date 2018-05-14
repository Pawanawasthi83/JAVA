package example.corejava.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortingByComparable {

	public static void main(String[] args) {
		
		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(new Emp(111,"Pawan"));
		al.add(new Emp(444,"Anu"));
		al.add(new Emp(555,"Ratan"));
		al.add(new Emp(333,"Durga"));
		Collections.sort(al);
		
		for(Emp e1:al){
			System.out.println(e1.eid+"---"+e1.ename);
		}
		

	}

}
