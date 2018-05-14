package example.corejava.arrays;

public class CopyingAnArray {

	public static void main(String[] args) {
		
		int[] a={21,32,0,54,7};
		int[] b=a;
		
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}

		a[1]=74;
		
		System.out.println("=="+b[1]);
		
		b[2]=33;
		System.out.println("++"+a[2]);
	}

}
