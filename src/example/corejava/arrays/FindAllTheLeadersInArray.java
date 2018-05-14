package example.corejava.arrays;

import java.util.Arrays;

public class FindAllTheLeadersInArray {

	public static void main(String[] args) {
		
		findTheLeaders(new int[] {12, 9, 7, 14, 8, 6, 3});
		findTheLeaders(new int[] {8, 23, 19, 21, 15, 6, 11});
        findTheLeaders(new int[] {55, 67, 71, 57, 51, 63, 38});
        findTheLeaders(new int[] {21, 58, 44, 14, 51, 36, 23});
	}

	private static void findTheLeaders(int[] inputArray) {
		
		System.out.println("The leaders in "+Arrays.toString(inputArray)+" are : ");
		int max = inputArray[inputArray.length-1];
		System.out.println(max);
		for(int i=inputArray.length-2;i>0;i--){
			if(inputArray[i]>max){
				max=inputArray[i];
				System.out.println(max);
			}
		}
		
	}

}
