package example.corejava.arrays;

import java.util.Arrays;

public class ArrayOperation02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] i = {1,2,3};
		int[] j = new int[1];
		
		System.out.println(Arrays.toString(i));
		
		System.out.println(Arrays.toString(new int[]{1,2,3}));
		
		j=i;
		
		System.out.println(Arrays.toString(j));
	}

}
