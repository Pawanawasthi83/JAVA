package example.corejava.oops;

public class FinalizeMethodCase03 {

	static FinalizeMethodCase03 fm;
	public static void main(String[] args) throws InterruptedException {
		
		FinalizeMethodCase03 f = new FinalizeMethodCase03();
		System.out.println(f.hashCode());
		f=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(fm.hashCode());
		fm=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println("End Main Method...");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize Method call...");
		fm=this;
	}

}
