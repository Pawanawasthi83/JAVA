package example.corejava.arrays;

import java.util.Arrays;

public class HowToFindMeanAndMedianOfAnUnsortedArray {

	public static void main(String[] args) {
		int[] a = new int[]{1, 3, 4, 2, 6, 5, 8,5,7}; 

		Arrays.sort(a);
		int len=a.length;
		findMean(a,len);
		findMedian(a,len);
				
		
	}

	private static void findMean(int[] a,int n) {
		double sum=0;
		for(int i=0;i<n;i++){sum=sum+a[i];}
		double mean=sum/n;
		System.out.println("Mean: "+mean	);

		
	}

	private static void findMedian(int[] a,int n) {
		
		double median = 0;
		
		if(n%2!=0){
			 median=a[n/2];
		}else{
			int index=a.length/2;
			median=a[index-1]/2+a[index]/2;
			
		}
		
		System.out.println(median);
		
		
	}

}
