package example.corejava.sorting;

import java.util.Arrays;

public class TestShorting {

	public static void main(String[] args) {
		
		Sorting ob = new Sorting();
        
		// Sorted Array By Bubble sort
		int[] bubbleSortArr = ob.bubbleSort(new int[]{64, 34, 25, 12, 22, 11, 90} );
        System.out.println(Arrays.toString(bubbleSortArr));
        
        //Sorted Array By Selection sort
        int[] selectionSortArr = ob.SelectionShort(new int[]{10, 90, 49, 2, 1, 5, 23});
        System.out.println(Arrays.toString(selectionSortArr));
        
      //Sorted Array By Insertion sort
        int[] insertionSortArr = ob.InsertionShort(new int[]{6,5,4,3,2,1});
        System.out.println(Arrays.toString(insertionSortArr));
        
        
        
	}

}
