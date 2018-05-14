package example.corejava.arrays;

public class CopyingAnArrayUsingForLoop {

	public static void main(String[] args) {
		
		int[] a = {1,21,32,43,54,65,78,89,90};
		int[] b = new int[a.length];
		
		for(int i=0;i<a.length;i++){
			
			b[i]=a[i];
			
		}
		
		a[1]=790;
		System.out.println(b[1]);
		System.out.println(a[1]);
	}

}
