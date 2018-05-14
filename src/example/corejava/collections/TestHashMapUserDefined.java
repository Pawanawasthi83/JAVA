package example.corejava.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashMapUserDefined {

	public static void main(String[] args) {
		
		HashMap<Emp, Student> map = new HashMap<Emp,Student>();
		map.put(new Emp(111, "Diwan"), new Student(1, "ABC"));
		map.put(new Emp(222, "Emi"), new Student(2, "DEF"));
		map.put(new Emp(333, "Ally"), new Student(3, "GHI"));

		Set entrySet = map.entrySet();
		Iterator itr = entrySet.iterator();
		while(itr.hasNext()){
			Map.Entry entr = (Entry) itr.next();
			Emp e = (Emp) entr.getKey();
			System.out.println(e.eid+"----"+e.ename);
			Student std = (Student)entr.getValue();
			System.out.println(std.stdid+"----"+std.stdname);
		}
	}

}
