package example.corejava.stringoperation;

public class SwapTwoStringVariablesWithoutUsingTempVariable {

	public static void main(String[] args) {

		String s1 = "Java";
		String s2 = "J2ee";
		
		s1=s1+s2;
		System.out.println(s1);
		s2=s1.substring(0,s1.length()-s2.length());
		
		System.out.println(s2);
		s1=s1.substring(s2.length());
		
		System.out.println(s1);
		
	}

}
