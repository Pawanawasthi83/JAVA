package example.corejava.arrays;

public class CopyingAnArrayUsingArrayCopyMethod {

	public static void main(String[] args) {
		
		int[] a ={111,222,333,444,555,666};
		
		int[] b = new int[a.length];
		
		System.arraycopy(a, 0, b, 0, a.length);

	}

}
