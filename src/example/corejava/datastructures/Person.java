package example.corejava.datastructures;

public class Person {

	String name;
	int rnum;
	
	public Person(String name ,int rnum) {
		this.name=name;
		this.rnum=rnum;
	}
	
	public String toString() {
		return name+rnum;
		
	}
}
