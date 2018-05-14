package example.corejava.arrays;

public class ArrayOperation01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaring an array
		
		int[] intarr;
		int arr[];
		
		//initiate an array
		
		intarr= new int[10];
		
		System.out.println(intarr[1]);
		intarr[2]=10;
		intarr[5]=25;
		
		System.out.println(intarr[2]);
		System.out.println(intarr[5]);
		
		int[] arrayofints = new int[]{2,3,4,5,7,8,9};
		int[] arrayofint = {2,3,4,5,7,8,9};
		
		for(int i=0;i<arrayofints.length;i++){
			
			System.out.println(arrayofints[i]);
		}
		
				
	}

}
