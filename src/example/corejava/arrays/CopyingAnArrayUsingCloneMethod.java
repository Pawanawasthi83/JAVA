package example.corejava.arrays;

public class CopyingAnArrayUsingCloneMethod {

	public static void main(String[] args) {
		
		int[] a ={1,2,3,4};
		
		int[] b = a.clone();
		
		System.out.println(a[1]);
		a[1]=100;
		System.out.println(a[1]);
		System.out.println(b[1]);

	}

}
