package example.corejava.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(10.5);
		al.add("pawan");
		al.add('p');
		al.add(10);
		
		System.out.println(al);
		
		Emp e = new Emp(111, "pawan");
		Student s = new Student(1, "Awasthi");
		ArrayList ls = new ArrayList();
		
		ls.add(e);
		ls.add(s);
		ls.add(10);
		ls.add("Pawan");
		
		
		System.out.println(ls);
		
		for(Object o :ls){
			
			if(o instanceof Emp){
				Emp ee = (Emp)o;
				System.out.println(ee.eid+"---"+ee.ename);
			}else if(o instanceof Student){
				Student ss = (Student)o;
				System.out.println(ss.stdid+"---"+ss.stdname);
			}else{
				System.out.println(o);
			}
			
		}
		
		//Generic version of collection
		
		System.out.println("#### Generic version of collection ####");
		
		Emp e1=new Emp(111, "Pawan");
		Emp e2=new Emp(222, "Anu");
		Emp e3=new Emp(333, "John");
		ArrayList<Emp> list= new ArrayList<Emp>();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		for(Emp emp:list){
			
			System.out.println(emp.eid+"------"+emp.ename);
		}
		
		System.out.println("#### Basic operation on ArrayList ####");
				
		ArrayList arList= new ArrayList();
		arList.add(10);
		arList.add(10.5);
		arList.add("Ratan");
		arList.add("Anu");
		System.out.println(arList.size());
		System.out.println(arList);
		arList.add(1,"Pawan");
		System.out.println(arList);
		System.out.println(arList.size());
		
		arList.remove(0);
		System.out.println(arList);
		arList.remove("Anu");
		System.out.println(arList);
		
		System.out.println(arList.contains("Pawan"));
		System.out.println(arList.isEmpty());
		System.out.println(arList.get(0));
		
		System.out.println(arList);
		arList.addAll(al);
		System.out.println(arList);
		arList.addAll(3,ls);
		System.out.println(arList);
		System.out.println(arList.containsAll(al));
		System.out.println(arList.iterator().next());
		System.out.println(arList.iterator().next());
		System.out.println(arList.iterator().next());
		System.out.println(arList.iterator().hasNext());
		System.out.println(Arrays.toString(arList.toArray()));
		
		System.out.println("List All ArrayList Createed");
		System.out.println(al);
		System.out.println(ls);
		System.out.println(list);
		System.out.println(arList);
		
		
		Emp e11 = new Emp(1111, "Pawan");
		Emp e12 = new Emp(2222, "Anil");
		Emp e13 = new Emp(3333, "Priya");
		Emp e14 = new Emp(4444, "Mayank");
		
		ArrayList<Emp> empList1=new ArrayList<Emp>();
		empList1.add(e11);
		empList1.add(e12);
		
		ArrayList<Emp> empList2=new ArrayList<Emp>();
		empList2.addAll(empList1);
		empList2.add(e13);
		empList2.add(e14);
		
		
		//empList2.removeAll(empList1);
		empList2.retainAll(empList1);
		for(Emp em:empList2){
			
			System.out.println(em.eid+"---"+em.ename);
		}
		}

}
