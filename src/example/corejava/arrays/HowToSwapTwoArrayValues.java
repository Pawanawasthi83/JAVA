package example.corejava.arrays;

import java.util.Arrays;

public class HowToSwapTwoArrayValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] i = {1,2,3};
		int[] j = {4,5,6};
		
		int iLength = i.length;
		int jLength = j.length;
		
		int[] k=new int[iLength+jLength];
		
		System.arraycopy(i, 0, k, 0, iLength);
		System.out.println(Arrays.toString(k));
		System.arraycopy(j, 0, k, iLength, jLength);
		System.out.println(Arrays.toString(k));
		
		System.arraycopy(k, 0, j, 0, iLength);
		System.out.println(Arrays.toString(j));
		
		System.arraycopy(k, iLength, i, 0, iLength);
		System.out.println(Arrays.toString(i));
		
		
		
		
	}

}
