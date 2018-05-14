package example.corejava.collections;

import java.util.Comparator;

public class StdnameCom implements Comparator<Student>{

	@Override
	public int compare(Student e1, Student e2) {
		
		return e1.stdname.compareTo(e2.stdname);
	}

}
