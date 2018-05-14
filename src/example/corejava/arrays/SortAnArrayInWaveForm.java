package example.corejava.arrays;

import java.util.Arrays;

public class SortAnArrayInWaveForm {

	public static void main(String[] args) {
		
		sortArrayInWaveForm(new int[]{10, 90, 49, 2, 1, 5, 23});

	}

	private static void sortArrayInWaveForm(int[] inputArr) {

			int[] sortedArray = sortArray(inputArr);
			System.out.println(Arrays.toString(sortedArray));
			for(int i=0;i<sortedArray.length-1;i+=2){
				swap(inputArr,i,i+1);
			}
	}

	private static int[] sortArray(int[] inputArr) {
		
		int len = inputArr.length;
		for(int i=0;i<len-1;i++){
			int min_inx = i;
			for(int j=i+1;j<len;j++){
				
				if(inputArr[j]<inputArr[min_inx]){
					min_inx=j;					
					
				}
				
			}
			swap(inputArr,i,min_inx);
			
			
		}
		
		
		return inputArr;
	}

	private static void swap(int[] inputArr, int i, int min_inx) {
		
				int temp=inputArr[i];
				inputArr[i]=inputArr[min_inx];
				inputArr[min_inx]=temp;
		
	}

}
