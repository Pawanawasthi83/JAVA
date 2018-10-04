package example.corejava.arrays;

import java.util.Arrays;

public class HowToCheckEqualityOfTwoArrays {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,5,7};
		int[] b = {1,3,2,5,7,9};
		Arrays.sort(a);
		Arrays.sort(b);
		checkEqualityIterativeMethod(a,b);
		checkEqualityInBuildEqualsMethod(a,b);
		
	}

	public static void checkEqualityIterativeMethod(int[] a,int[] b) {
		boolean result=false;
		
		if(a.length==b.length){
			for(int i=0;i<a.length;i++){
				if(a[i]==b[i]){
					result=true;
				}else{
					result=false;
					break;
				}
			}
		}else{
			result=false;
		}
		
		if(result){
			System.out.println("Both arrays are equals");
		}else{
			System.out.println("Arrays are not equals");
		}
	}
	
	public static void checkEqualityInBuildEqualsMethod(int[] a,int[] b){
		
		if(Arrays.equals(a, b)){
			System.out.println("Both arrays are equals");
		}else{
			System.out.println("Arrays are not equals");
		}
		
	}
}
