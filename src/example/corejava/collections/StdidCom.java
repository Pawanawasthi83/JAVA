package example.corejava.collections;

import java.util.Comparator;

public class StdidCom implements Comparator<Student>{

	@Override
	public int compare(Student e1, Student e2) {
		if(e1.stdid==e2.stdid){
			return 0;
		}else if(e1.stdid>e2.stdid){
			return 1;
		}else{
			return -1;
		}
		
	}

}
