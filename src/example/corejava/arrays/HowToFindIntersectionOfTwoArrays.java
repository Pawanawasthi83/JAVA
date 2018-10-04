package example.corejava.arrays;

import java.util.Arrays;

public class HowToFindIntersectionOfTwoArrays {

	public static void main(String[] args) {
		
		doSearchIntersectionofArrays(new int[] { 7, 4, 3, 8, 4, 10, 6, 8, 9, 9 },	new int[] { 2, 15, 26, 8, 10, 25, 34,8, 46,4 });
	}

	private static void doSearchIntersectionofArrays(int[] a,int[] b) {
		int arrSize=0;
		int m = a.length;
		int n = b.length;
		if(m<n){
			arrSize=m;
		}else{
			arrSize=n;
		}
		
		//System.out.println(arrSize);
		
		
		int[] interArray=new int[arrSize];
		int l=0;
		Arrays.sort(a);
		for(int j:b){
			if(Arrays.binarySearch(a, j)>=0){
				interArray[l++]=j;
			}
		}
		
		System.out.println(Arrays.toString(interArray));
	}

}
