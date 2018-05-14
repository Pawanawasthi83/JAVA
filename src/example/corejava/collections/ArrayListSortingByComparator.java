package example.corejava.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortingByComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(111, "Manish"));
		al.add(new Student(333, "Rahul"));
		al.add(new Student(222, "Pawan"));
		al.add(new Student(555, "Adesh"));
		
		Collections.sort(al,new StdnameCom());
		
		for(Student s:al){
			System.out.println(s.stdid+"---"+s.stdname);
		}
	}

}
