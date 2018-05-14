package example.corejava.collections;

import java.util.ArrayList;

public class ArrayListRetriveData {

	public static void main(String[] args) {
		
		// Normal Version -Not type safe
		ArrayList al = new ArrayList();
		al.add(new Emp(111, "Pawan"));
		al.add(new Emp(222, "Awasthi"));
		
		for(Object o:al){
			
			if(o instanceof Emp){
				Emp emp = (Emp) o;
				System.out.println(emp.eid+"---"+emp.ename);
			}
		}
		
		Emp ee = (Emp) al.get(0);
		System.out.println(ee.eid+"---"+ee.ename);
		//Generic Array List - Type safe
		System.out.println("Generic Array List - Type safe");
		ArrayList<Emp> ls = new ArrayList<Emp>();
		ls.add(new Emp(001, "p1"));
		ls.add(new Emp(002, "p2"));
		ls.add(new Emp(003, "p3"));
		ls.add(new Emp(004, "p4"));
		
		for(Emp ed:ls){
			System.out.println(ed.eid+"---"+ed.ename);
		}


		
	}

}
