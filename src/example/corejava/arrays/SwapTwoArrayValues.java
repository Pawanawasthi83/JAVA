package example.corejava.arrays;

import java.util.Arrays;

public class SwapTwoArrayValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] i={1,2,3};
		int[] j={4,5,6};
		int[]k=new int[i.length+j.length];
		System.arraycopy(i,0,k,0,i.length);
		
		System.arraycopy(j,0,k,i.length,j.length);
		System.out.println(Arrays.toString(k));
		
		System.arraycopy(k,0,j,0,j.length);
		System.out.println(Arrays.toString(j));
		
		System.arraycopy(k,i.length,i,0,i.length);
		System.out.println(Arrays.toString(i));
	}

}
