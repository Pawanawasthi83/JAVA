package example.corejava.arrays;

import java.util.Arrays;

public class InCompleteSeparateZeroFromNonZerosInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bringingZerosFront(new int[]{14, 0, 5, 2, 0, 3, 0});
	}

	private static void bringingZerosFront(int[] inputArray) {
		
		//System.out.println(Arrays.toString(inputArray));
		int length = inputArray.length;
		
		for(int i=0;i<length-1;i++){
			if(inputArray[i]==0){
				for(int j =length-i;j>0;j--){
					if(i<j){
					if(inputArray[j]!=0){
						int temp=inputArray[j];
						inputArray[j]=inputArray[i];
						inputArray[i]=temp;
						System.out.println("I:" +i);
						System.out.println("J:" +j);
						System.out.println(Arrays.toString(inputArray));
						break;
					}}
					
					
				}
			}
		}
		//System.out.println(Arrays.toString(inputArray));
		
	}

}
