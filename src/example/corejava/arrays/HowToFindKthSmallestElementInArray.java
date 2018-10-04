package example.corejava.arrays;

import java.util.Arrays;

public class HowToFindKthSmallestElementInArray {

	public static void main(String[] args) {
		
		kthSmallestElementMehod1(new int[]{7,3,5,8,2,1,9},3);

	}

	private static void kthSmallestElementMehod1(int[] a,int k) {
		
		if(k<a.length){
			Arrays.sort(a);
			System.out.println(a[k-1]);
		}else{
			throw new ArrayIndexOutOfBoundsException();
		}
	}

}
