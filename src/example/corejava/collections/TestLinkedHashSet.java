package example.corejava.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		
		LinkedHashSet<Student> hs = new LinkedHashSet<Student>();
		Student s1 = new Student(111, "Ram");
		Student s2 = new Student(222,"Ratan");
		Student s3 = new Student(333, "John");
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s1);
		
		Iterator<Student> itr = hs.iterator();
		while (itr.hasNext()) {
			Student student=itr.next();
			System.out.println(student.stdid+"----"+student.stdname);
			
		}
		

	}

}
