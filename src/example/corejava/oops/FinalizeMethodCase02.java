package example.corejava.oops;

public class FinalizeMethodCase02 {

	public static void main(String[] args) throws Throwable {
		
		FinalizeMethodCase02 fm = new FinalizeMethodCase02();
		fm.finalize();
		fm.finalize();
		fm=null;
		System.gc();
		System.out.println("Main Method Ends");
				

	}
	
	@Override
	protected void finalize() throws Throwable {
		
		System.out.println("Finalize method call");
		
	}

}
