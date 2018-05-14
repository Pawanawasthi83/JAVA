package example.corejava.collections;

public class Emp implements Comparable<Emp> {

	int eid;
	String ename;

	public Emp(int id, String name) {
		this.eid = id;
		this.ename = name;
	}

	@Override
	 public int compareTo(Emp e) {
	 if(eid==e.eid){
	 return 0;
	 }else if(eid>e.eid){
	 return 1;
	 }else{
	 return -1;
	 }
	 }

//	@Override
//	public int compareTo(Emp e) {
//		if(eid==e.eid){
//			return 0;
//		}else if(eid>e.eid){
//			return 1;
//		}else{
//			return -1;
//		}
//		
//	}

//	public int compareTo(Emp e) {
//
//		return ename.compareTo(e.ename);
//	}
}
	