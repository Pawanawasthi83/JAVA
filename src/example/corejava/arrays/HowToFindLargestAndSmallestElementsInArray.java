package example.corejava.arrays;

import java.util.Arrays;

public class HowToFindLargestAndSmallestElementsInArray {

	public static void main(String[] args) {
		
		findLargestElement(new int[]{1,4,8,98,120,300,76,83,77,999});
		findSmallestElement(new int[]{301,23,7,6,1,4,8,98,120,300,76,83,77,999,0});
	}

	private static void findSmallestElement(int[] b) {
		int min=b[0];
		
		for(int i=1;i<b.length;i++){
			if(b[i]<min){
				min=b[i];
			}
		}
		
		System.out.println(min);
		
		
	}

	private static void findLargestElement(int[] a) {
		
		int max =a[0];
		
		for(int i=1;i<a.length;i++){
			if(a[i]>max){
				max=a[i];
			}
		}
		
		System.out.println(max);
		
	}

}
