package example.corejava.stringoperation;

public class StringOverRideToStringMethod {

	int rollnumber;
	String ename;
	StringOverRideToStringMethod(int rollnumber , String ename){
		this.rollnumber=rollnumber;
		this.ename=ename;
	}
	public String toString() {
		return "Enp ID : "+rollnumber+" Enploye Name : "+ename;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringOverRideToStringMethod emp1 = new StringOverRideToStringMethod(123, "Pawan");
		
		System.out.println(emp1);
		
		StringOverRideToStringMethod emp2 = new StringOverRideToStringMethod(111, "Awasthi");
		
		System.out.println(emp2.toString());
	}

}
