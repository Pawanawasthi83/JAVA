package example.corejava.arrays;

import java.util.Arrays;

public class ShortArrayValues {

	public static void main(String[] args) {
		
		int[] a = new int[]{45, 12, 78, 34, 89, 21};
		shortArray(a);
	}

	private static void shortArray(int[] inputArr) {
		int length = inputArr.length;
		for(int i=0;i<length-1;i++){
			for(int j=0;j<length-1-i;j++){
			if(inputArr[j]>inputArr[j+1]){
				swap(inputArr,j,j+1);
			}
		}
		}System.out.println(Arrays.toString(inputArr));
	}
	private static void swap(int[] inputArr, int i, int j) {
		int temp=inputArr[i];
		inputArr[i]=inputArr[i+1];
		inputArr[i+1]=temp;
	}
}