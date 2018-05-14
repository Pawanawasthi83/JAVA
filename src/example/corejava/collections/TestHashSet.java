package example.corejava.collections;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

	public static void main(String[] args) {
		
		HashSet<Student> hs = new HashSet<Student>();
		Student s1 = new Student(111, "Ram");
		Student s2 = new Student(222,"Ratan");
		Student s3 = new Student(333, "John");
		Student s4 = null;
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		
		Iterator<Student> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println("In side While..");
			if(itr.next()!=null){
				Student student=itr.next();
				System.out.println(student.stdid+"----"+student.stdname);
			}
		}
		
		HashSet<String> set = new HashSet<String>();
		set.add(null);
		System.out.println(set);

	}

}
