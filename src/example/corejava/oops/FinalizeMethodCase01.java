package example.corejava.oops;

public class FinalizeMethodCase01 {

	public static void main(String[] args) {
		
		ClassA a = new ClassA();
		String s = new String("PAwan");
		FinalizeMethodCase01 demo = new FinalizeMethodCase01();
		a=null;
		s=null;
		demo=null;
		System.gc();
		System.out.println("End of method main...");

	}
	
	public void finalize() {
		
		System.out.println("Finalize Method Call From FinalizeMethodCase01 Class");
	}
}
	
