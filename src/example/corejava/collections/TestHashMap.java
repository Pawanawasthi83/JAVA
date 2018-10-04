package example.corejava.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		map.put(111, "Durga");
		map.put(222, "Anu");
		map.put(333, "Emey");
		map.put(null, null);
		map.put(null, null);
		System.out.println(map);
		
		Set s1=map.keySet();
		System.out.println(s1);
		
		Collection c = map.values();
		System.out.println(c);
		
		Set s2 = map.entrySet();
		
		Iterator itr = s2.iterator();
		
		while (itr.hasNext()) {
			
			Map.Entry st = (Map.Entry) itr.next();
			
			System.out.println(st.getKey()+"---"+st.getValue());
			
			
		}
		
		
	}
	

}
