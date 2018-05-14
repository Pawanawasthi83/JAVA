package example.corejava.searching;

import java.util.Arrays;

import example.corejava.sorting.Sorting;

public class Searching extends Sorting {

	public boolean linearSearch(int[] inputArr, int x) {
		
		boolean ispresent=false;
		
		for(int i=0;i<inputArr.length;i++){
			
			if(inputArr[i]==x){
				ispresent=true;
				return ispresent;
			}
		}
		return ispresent;
		
	}

	public boolean BinarySearch(int[] inputArr, int x) {
		
		boolean isPresent = false;
		int[] sortedArr = bubbleSort(inputArr);
		System.out.println(Arrays.toString(sortedArr));
		
		int l=0;
		int r= sortedArr.length-1;
		
		while (l<=r) {
			int mid=l+(r-l)/2;
			if(sortedArr[mid]==x){
				isPresent=true;
				return isPresent;
			}//Ignore left arr
			else if(sortedArr[mid]<x){
				l=mid+1;
			}else{
				r=mid-1;
			}		
			}
		
		
		return false;
	}

	
	
}
