package example.corejava.stringoperation;

public class StringOperations06 {

	public static void main(String[] args) {
		
		int[] a = new int[100];
		System.out.println(a.length);
		String s = "pawan";
		System.out.println(s.length());
		StringBuffer sb =  new StringBuffer("Awasthi");
		System.out.println(sb.length());
		
		System.out.println("----String Class Methods SET_1----");
		String str ="awasthi";
		System.out.println(str.charAt(2));
		System.out.println(str.indexOf('a'));
		System.out.println(str.lastIndexOf('a'));
		
		System.out.println("----String Class Methods SET_2----");
		String str1 ="AIZPA5190L";
		System.out.println(str1.contains("AIZPA"));
		System.out.println(str1.startsWith("AIZPA"));
		System.out.println(str1.startsWith("90L"));
		System.out.println(str1.endsWith("90L"));
		
		System.out.println("----String Class Methods SET_3----");
		String str2 = "pawan";
		System.out.println(str2.toUpperCase());
		String str3 = "PAWAN";
		System.out.println(str3.toLowerCase());
		String str4 = "   pawan   ";
		System.out.println(str4.length());
		System.out.println(str4.trim().length());
		System.out.println(str4.trim());
		
	}

}
