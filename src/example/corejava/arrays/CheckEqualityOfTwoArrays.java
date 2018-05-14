package example.corejava.arrays;

import java.util.Arrays;

public class CheckEqualityOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,5,7};
		int[] b = {1,2,3,5,7,9};
		checkEqualityIterativeMethod(a,b);
		checkEqualityInBuildEqualsMethod(a,b);
	}

	private static void checkEqualityInBuildEqualsMethod(int[] i, int[] j) {
		boolean equalornot=true;
		if(i.length==j.length){
			if(!Arrays.equals(i, j)){
				equalornot=false;}
			}else{
			equalornot=false;
			}
		
		if(equalornot){
			System.out.println("Both the arrays are equal");
		}else{
			System.out.println("Both the arrays are not equal");
		}
	}
	


	private static void checkEqualityIterativeMethod(int[] i,int[] j) {
		
		boolean equalornot=true;
		
		if(i.length==j.length){
			for(int n =0;n<i.length;n++){
				if(i[n]!=j[n]){
					equalornot=false;
				}
			}
			
		}else{
			equalornot=false;
		}
		
		if(equalornot){
			System.out.println("Both the arrays are equal");
		}else{
			System.out.println("Both the arrays are not equal");
		}
		
	}
	

}
