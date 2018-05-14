package example.corejava.sorting;

import java.util.Arrays;

public class Sorting {

	//The Bubble sort repeatedly swapping the adjacent elements if they are in wrong order.
	
	public int[] bubbleSort(int inputarr[])
	    {
	        int n = inputarr.length;
	        for (int i = 0; i < n-1; i++){
	            for (int j = 0; j < n-i-1; j++){
	            	if (inputarr[j] > inputarr[j+1])
	                {
	                    swap(inputarr,j,j+1);
	                 }
	            }
	            }
	        return inputarr;
	    }
	    
	//The selection sort algorithm sorts an array by repeatedly finding the minimum element 
	//(considering ascending order)from unsorted part and putting it at the beginning.
	
	int[] SelectionShort(int[] inputArr) {
	
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

	//Uses: Insertion sort is used when number of elements is small. 
	//It can also be useful when input array is almost sorted, 
	//only few elements are misplaced in complete big array.
	
	public int[] InsertionShort(int[] inpurArr) {
		
		int len = inpurArr.length;
		for(int i=1;i<len;i++){
			int key = inpurArr[i];
			int j=i-1;
			while(j>=0 && inpurArr[j] > key ){
				inpurArr[j+1]=inpurArr[j];
				j=j-1;
			}
			inpurArr[j+1]=key;
		}
		return inpurArr;
	}

}