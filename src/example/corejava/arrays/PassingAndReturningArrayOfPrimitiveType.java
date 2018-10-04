package example.corejava.arrays;

public class PassingAndReturningArrayOfPrimitiveType {

	public static void main(String[] args) {
		
		int[] a = {12,23,34,56,45};
		double[] b= new double[5];
		b[0]=99.9;
		b[1]=78.8;
		primitiveTypeArrasyParameter(a,b);
		System.out.println(b[0]);
		
		int[] c = returningPrimitiveTypeArray();
		System.out.println(c[0]);
	}
	
	private static void primitiveTypeArrasyParameter(int[] x,double[] y) {
		
		System.out.println(x[2]);
		y[0]=999.9;
		System.out.println(y[0]);

	}
	
	private static int[] returningPrimitiveTypeArray() {
		int[] a =new int[10];
		a[0]=100;
		a[1]=200;
		return a;
		
	}
	
	

}
