package example.corejava.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class HowToFindDuplicateElementsArray {

	public static void main(String[] args) {

		doSearchDuplicateIntValues(new int[] { 10, 10, 6, 10, 2, 3, 4, 5, 6, 10, 3, 4, 7, 10 });
		doSearchDuplicateStringValues(new String[]{"Pawan","Awasthi","Durga","Pawan","Pawan"});
	}

	private static void doSearchDuplicateStringValues(String[] inputArr) {
		
		String[] outarr = new String[(inputArr.length)/2];
		
		for(int i=0;i<inputArr.length;i++){
			int count=0;
			for(int j=i+1;j<inputArr.length;j++){
				if(inputArr[i].equalsIgnoreCase(inputArr[j])){
					count++;
				}
			}
			System.out.println("Found "+inputArr[i]+" "+count);
		}
		
		
	}

	private static void doSearchDuplicateIntValues(int[] inputArray) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < inputArray.length; i++) {
			if (map.containsKey(inputArray[i])) {
				map.put(inputArray[i], (map.get(inputArray[i]) + 1));
			} else {
				map.put(inputArray[i], 1);
			}

		}
		System.out.println(map.toString());

	}

}
