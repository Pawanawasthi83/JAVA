package example.corejava.stringoperation;

public class HowToSwapTwoStringVariables {

	public static void main(String[] args) {

		doStringSwapWithTempVariable("Java", "J2ee");
		doStringSwapWithOutTempVariable("Pawan", "Awasthi");

	}

	private static void doStringSwapWithOutTempVariable(String string1, String string2) {
		
			 string1=string1+string2;
			 string2=string1.substring(0, string1.length()-string2.length());
			 string1=string1.substring(string2.length());
			 System.out.println("String1 : "+string1);
			 System.out.println("String2 : "+string2);

	}

	private static void doStringSwapWithTempVariable(String string1, String string2) {
		
		String temp=string1;
		string1=string2;
		string2=temp;
		System.out.println("string1 : "+string1);
		System.out.println("string2 : "+string2);
		

	}

}
