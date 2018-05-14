package example.corejava.arrays;

import java.util.Arrays;

public class ArraysClassMethods {

	public static void main(String[] args) {

		int[] a = {2,10,3,400,5,6,88,8,23,35,78};
		
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.binarySearch(a, 3));
		System.out.println(Arrays.binarySearch(a, 500));
		
		String[] str = {"Java","Concept","Of","The","Day"};
		Arrays.sort(str);
		System.out.println(Arrays.binarySearch(str, "Of"));
		
		int[] i = new int[15];
		Arrays.fill(i, 2);
		System.out.println(Arrays.toString(i));
		
		int[] j;
		j=Arrays.copyOf(i, 3);
		System.out.println(Arrays.toString(j));
		
		int[] k=j.clone();
		System.out.println(Arrays.toString(k));
		int[] l=new int[15]; ;
		System.arraycopy(i, 0, l, 3, 8);
		Arrays.fill(l, 5);
		
		System.out.println(Arrays.toString(l));
		
		int[] m = Arrays.copyOfRange(l, 3, 16);
		System.out.println(m.length);
		
		System.out.println(Arrays.toString(m));
		
	}

}
