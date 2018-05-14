package example.corejava.stringoperation;

public class ConvertIntegerToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 12345;
		
		String s1 = String.valueOf(i);
		
		String s2 = Integer.toString(i);
		
		System.out.println(s1+s2);
		
		String s3 = new String("Java");
		String s4 = new String("Java");

		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		System.out.println(s3.hashCode()==s4.hashCode());
		}

}
