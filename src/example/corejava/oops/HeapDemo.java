package example.corejava.oops;

public class HeapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Runtime r = Runtime.getRuntime();
		System.out.println("Max Memory : "+ r.maxMemory()/(1024*1024) +" M.B");
		System.out.println("Total Memory : "+ r.totalMemory()/(1024*1024) +" M.B");
		System.out.println("Free Memory : "+ r.freeMemory()/(1024*1024) +" M.B");
		System.out.println("Available Processors : "+ r.availableProcessors());
		System.out.println(r.getClass());
		r.gc();
		
		
		
	}

}
