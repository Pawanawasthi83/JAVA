package example.corejava.arrays;

public class HowToFindSecondLargestNumberIntegerArray {

	public static void main(String[] args) {
		
		getSecondLargect(new int[]{1,3,4,6,8,9,76,45,65,34,89,78,99,100,101});
		
	}

	private static void getSecondLargect(int[] a) {
		
		int firstlargest=0;
		int secondlargest=0;
		if(a[0]>a[1]){
			firstlargest=a[0];
			secondlargest=a[1];
		}else{
			firstlargest=a[1];
			secondlargest=a[0];
		}
		
		for(int i=2;i<a.length;i++){
			if(a[i]>firstlargest){
				secondlargest=firstlargest;
				firstlargest=a[i];
				
			}else if(a[i]<firstlargest && a[i]>secondlargest){
				secondlargest=a[i];
			}
		}
		
		System.out.println(firstlargest+"  "+secondlargest);
		
	}

}
