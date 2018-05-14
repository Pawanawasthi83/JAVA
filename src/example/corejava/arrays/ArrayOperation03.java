package example.corejava.arrays;

import java.util.Arrays;

public class ArrayOperation03 {

	public static void main(String[] args) {


		int[] a = new int[]{1,2,3};
		int[] b = new int[]{4,5,6,7,};
		
		a=b;
		
		System.out.println(Arrays.toString(a));

		b=a;
		System.out.println(Arrays.toString(b));
	}

}
