package example.corejava.collections;

public class Manager implements Comparable<Manager>{

	int managerId;
	String managerName;
	
	public Manager(int managerId,String managerName ){
		
		this.managerId=managerId;
		this.managerName=managerName;
	}

	@Override
	public int compareTo(Manager o) {
		// TODO Auto-generated method stub
		return managerName.compareTo(o.managerName);
	}

//	@Override
//	public int compareTo(Manager m) {
//		
//		if(managerId==m.managerId){
//				return 0;
//			}else if(managerId>m.managerId){
//				return 1;
//			}else{
//				return -1;
//			}
//	}
	
	

}
