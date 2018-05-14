package example.corejava.arrays;

class C {
	int i;
}
public class PassingArrayOfDerivedTypeAsParameter {

	public static void main(String[] args) {
		C[] arr = new C[5];
		arr[0]=new C();
		arr[1]=new C();
		
		arr[0].i=10;
		arr[1].i=20;
		
		MethodOne(arr);
		
		System.err.println(arr[0].i);
		System.err.println(arr[1].i);
	}

	private static void MethodOne(C[] arrObj) {
		// TODO Auto-generated method stub
		
		arrObj[0].i=111;
		arrObj[1].i=333;
	}

}
