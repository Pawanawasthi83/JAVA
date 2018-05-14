package example.corejava.stringoperation;

public class StringOperations01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 ="pawan";
		String s2 = "awasthi";
		String s3 = new String("pawan");
		String s4 = "pawan";
		StringBuffer s5 = new StringBuffer("pawan");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		
		s1.concat("ppp");
		
		System.out.println(s1);
		System.out.println(s1.toString());//String class override the toString() and returns content of string object
		
		s5.append("ABCD");
		
		System.out.println(s5);
		System.out.println(s5.toString());//StringBuffer class override the toString() and returns content of stringBufffer object
		
	}

}
