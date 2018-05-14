package example.corejava.arrays;

import java.util.Arrays;

public class CopyingAnArrayUsingCopyOfMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,2,3,4,5,6,7,8};
		int[] b = Arrays.copyOf(a, a.length);
		
		for(int i=0;i<b.length;i++){
			
			System.out.println("Array element in array b at index "+i+" : "+b[i]);
		}
		
		a[1]=111;
		System.out.println(a[1]);
		System.out.println(b[1]);
		
		b[2]=222;
		System.out.println(a[2]);
		System.out.println(b[2]);
	}

}
