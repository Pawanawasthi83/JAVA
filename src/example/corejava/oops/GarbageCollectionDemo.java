package example.corejava.oops;

import java.util.Date;

public class GarbageCollectionDemo {

	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runtime r =Runtime.getRuntime();
		//System.out.println(r.totalMemory()/(1024*1024));
		//System.out.println(r.freeMemory()/(1024*1024));
		
		for(int i=0 ;i <=1000000;i++){
			//Date d = new Date();
			//ClassA a = new ClassA();
			GarbageCollectionDemo g = new GarbageCollectionDemo();
			//System.out.println(i);
			//a=null;
			//d=null;
			g=null;
		}
		
		//System.out.println(r.freeMemory()/(1024*1024));
		//r.gc();
		//System.out.println(r.freeMemory()/(1024*1024));
		
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize Method call : "+ ++count);
	}

}
