package example.corejava.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class SortTreeSetWithComparator {

	public static void main(String[] args) {
		TreeSet<String> ts1= new TreeSet<String>();// Default Constructor
		ts1.add("Durga");
		ts1.add("Ali");
		ts1.add("Emi");
		ts1.add("John");
		//ts1.add(null);//Null is not allowed,NullPointerException
		//ts1.add(10);//Hetrogeneous data not allowed.ClassCasrException
		
		System.out.println(ts1);
		TreeSet<String> ts2 = new TreeSet<String>(ts1);// Creating treeset from another collection
		ts2.add("Pawan");
		ts2.add("Anu");
		System.out.println(ts2);
		
		Student std1 = new Student(111, "Ali");
		Student std2 = new Student(333, "Pawan");
		Student std3 = new Student(555, "Emey");
		Student std4 = new Student(777, "John");
		
		TreeSet<Student> ts3 = new TreeSet<Student>(new StudentNameComp());// With Comparator
		ts3.add(std1);
		ts3.add(std2);
		ts3.add(std3);
		ts3.add(std4);
		
		for(Student ss:ts3){
			System.out.println(ss.stdid+"----"+ss.stdname);
		}
		

	}

}

class StudentIDComp implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.stdid==s2.stdid){
			return 0;
		}else if(s1.stdid>s2.stdid){
			return 1;
		}else{
			return -1;
		}
	}
	
}

class StudentNameComp implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		
		return s1.stdname.compareTo(s2.stdname);
		
	}
	
}