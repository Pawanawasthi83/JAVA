package example.corejava.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class HowToFindAllPairsofElementsInArrayWhoseSumEqualGivenNumber {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int arrLength = scan.nextInt();
		System.out.println("Enter Sum of Two Elements : ");
		int Sum=scan.nextInt();
		
		int arr[] = new int[arrLength];
		for(int i =0;i<arr.length;i++){
			
			System.out.println("Eneter Element at Index : "+i);
			int element=scan.nextInt();
			arr[i]=element;
		}
		scan.close();
		System.out.println(Arrays.toString(arr));
		
		for(int j=0;j<arr.length;j++){
			for(int k=j+1;k<arr.length;k++){
				int elemetssum=arr[j]+arr[k];
				if(elemetssum==Sum){
					System.out.println("Pair : "+ arr[j]+" ,"+arr[k]);
					
				}
				
			}
		}
		
	}

}
