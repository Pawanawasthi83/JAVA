package example.corejava.stringoperation;

public class StringOperations03 {

	int rollnumber;
	String ename;
	StringOperations03(int rollnumber , String ename){
		this.rollnumber=rollnumber;
		this.ename=ename;
	}
	public String toString() {
		return "Enp ID : "+rollnumber+" Enploye Name : "+ename;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringOperations03 emp1 = new StringOperations03(123, "Pawan");
		
		System.out.println(emp1);
		
		StringOperations03 emp2 = new StringOperations03(111, "Awasthi");
		
		System.out.println(emp2);
	}

}
