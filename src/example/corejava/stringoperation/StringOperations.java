package example.corejava.stringoperation;

public class StringOperations {

	public static void main(String[] args) {
		
		String str1 ="pawan";
		String str2 = "awasthi";
		String str3 = new String("pawan");
		String str4 = "pawan";
		StringBuffer str5 = new StringBuffer("Lila");
		String str6 = new String("ratan");
		String str7 = new String("ratan");
		
		//=== operator Compares two references and returns true in both are pointing to same objects
		System.out.println(str1==str2);//false  
		System.out.println(str1==str3);//false
		System.out.println(str1==str4);//true
		System.out.println(str1.compareTo(str4));//0
		
		//String class override equals() method and do content comparison
		System.out.println(str1.equals(str3));//true 
		System.out.println(str6==str7);//false
		System.out.println(str6.equals(str7));//true
		System.out.println(str6.compareTo(str7));//0
		
		//String buffer class does't override equals() method from Object class and
		//also compareto() method from Comparable Interface
		
		StringBuffer str8 = new StringBuffer("Lila");
		StringBuffer str9 = new StringBuffer("Lila");
		
		System.out.println(str8==str9);//false
		System.out.println(str8.equals(str9));//false
		System.out.println(str8.toString().equals(str9.toString())); //True
		// Concat is used to add a String at the end of another String.
		// Concat creates a new String object
		str1.concat("A");
		System.out.println(str1);
		
		//Append adds a String or character sequence to StringBufffer. 
		//Its used existing objects
		str5.append("ABCD");
		System.out.println(str5);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
