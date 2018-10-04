package example.corejava.arrays;

import java.util.Arrays;

public class ArrayMultiDimensional {

	public static void main(String[] args) {
		
			int[] arr1={1,2,3};
			int[] arr2={4,5,6,7};
			int[] arr3={7,8,9,99,100};
			int[] arr4={11,22,33};
			int[] arr5={44,55,66,77};
			int[] arr6={77,88,99,999,898};
			int[] threeDArray[][]={
									{
										{1,2,3},{4,5,6}
									},
									{
										{11,22,33},{44,55,66}
									}
								  };
			
		int[][] twoDimensinalArray01={arr1,arr2,arr3};
		int[][] twoDimensinalArray02={arr4,arr5,arr6};
		int[][][] threeDimensinalArray = {twoDimensinalArray01,twoDimensinalArray02};
		System.out.println(Arrays.toString(threeDArray[0][0]));
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.deepToString(twoDimensinalArray01));
		System.out.println(Arrays.deepToString(threeDimensinalArray));
		
		for(int i=0;i<threeDimensinalArray.length;i++){
			for(int j =0;j<threeDimensinalArray[i].length;j++){
				for(int k =0;k<threeDimensinalArray[i][j].length;k++){
					
					System.out.print(threeDimensinalArray[i][j][k]);
					System.out.print(" ");
				}
				//System.out.println("");
			}
		}
		
		

	}

}
