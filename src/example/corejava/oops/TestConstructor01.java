package example.corejava.oops;

public class TestConstructor01 {

	int roll;
	String name;
	
	TestConstructor01(int rl ,String nm){
		System.out.println("In side Constractor");
		System.out.println(this.roll+"====="+this.name);
		this.roll=rl;
		this.name=nm;
	}
	
	public static void main(String[] args) {
		
		
		TestConstructor01 s = new TestConstructor01(10,"Pawan");
		
		System.out.println(s.roll+"-----"+s.name);
	}

}
