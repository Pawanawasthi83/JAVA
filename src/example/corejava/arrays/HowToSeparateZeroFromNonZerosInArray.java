package example.corejava.arrays;

import java.util.Arrays;

public class HowToSeparateZeroFromNonZerosInArray {

	public static void main(String[] args) {

		bringingZerosEnd(new int[] { 14, 0, 5, 2, 0, 3, 0 });
		bringingZerosFront(new int[] { 14, 0, 5, 2, 0, 3, 0 });
	}

	private static void bringingZerosEnd(int[] inputArray) {
		int count =0;
		int length = inputArray.length;
		for(int i=0;i<length;i++){
			if(inputArray[i]!=0){
				inputArray[count]=inputArray[i];
				count++;
			}
		}
		
		while(count<length){
			inputArray[count]=0;
			count++;
		}
		System.out.println(Arrays.toString(inputArray));
	}
	
	private static void bringingZerosFront(int[] inputArray) {
		
		int length = inputArray.length;
		int count =length-1;
		for(int i=length-1;i>=0;i--){
			if(inputArray[i]!=0){
				inputArray[count]=inputArray[i];
				count--;
			}
		}
		
		while(count>=0){
			inputArray[count]=0;
			count--;
		}
		System.out.println(Arrays.toString(inputArray));
	}
}
