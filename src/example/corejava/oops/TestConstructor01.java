package example.corejava.oops;

public class TestConstructor01 {

	int roll = 100;;
	String name="Pawan";
	static int Count=0;
	{
		Count++;
	}
	TestConstructor01(){
		super();
		
	}
	TestConstructor01(int rl ,String nm){
		System.out.println("In side Constractor");
		System.out.println(this.roll+"====="+this.name);
		this.roll=rl;
		this.name=nm;
	}
	
	public static void main(String[] args) {
		
		
		TestConstructor01 s1 = new TestConstructor01();
		TestConstructor01 s2 = new TestConstructor01();
		System.out.println(s1.roll+"-----"+s1.name);
		System.out.println(s2.roll+"-----"+s2.name);
		s1.name="Durga";
		System.out.println(s1.roll+"-----"+s1.name);
		
		System.out.println(Count);
	}

}
