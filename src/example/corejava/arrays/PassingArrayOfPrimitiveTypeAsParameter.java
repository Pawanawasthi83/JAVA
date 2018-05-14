package example.corejava.arrays;

public class PassingArrayOfPrimitiveTypeAsParameter {

	public static void main(String[] args) {
		
		int[] intarrays=new int[5];
		intarrays[0]=12;
		intarrays[1]=22;
		System.out.println(intarrays[0]);
		System.out.println(intarrays[1]);
		MethodOne(intarrays);
		int[] b = MethodTwo();
		
		for(int j=0;j<b.length;j++){
			System.out.println("Element at Index "+j+" : "+b[j]);
		}
		
	}

	private static int[] MethodTwo() {
		int[] a = new int[]{1,2,3,4};
		
		return a;
			
	}

	private static void MethodOne(int[] arr) {
		// TODO Auto-generated method stub
	
		arr[0]=30;
		arr[1]=40;
	}
	

	
}
