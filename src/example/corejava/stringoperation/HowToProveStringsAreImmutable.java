package example.corejava.stringoperation;

public class HowToProveStringsAreImmutable {

	public static void main(String[] args) {
		
		String s1 ="Java";
		String s2 = "Java";
		
		System.out.println(s1==s2);
		
		s1=s1+"J2EE";
		
		System.out.println(s1==s2);
		
		String s3 = new String("Java");
		String s4 = new String("Java");
		
		System.out.println(s2==s3);
		System.out.println(s2==s4);
		System.out.println(s3==s4);
		
		s3.concat("J2EE");
		
		System.out.println(s3);
	}

}
