package example.corejava.stringoperation;

public class StringOperations05 {

	public static void main(String[] args) {
		
		String s1 = "Pawan";
		
		StringBuffer sb1 = new StringBuffer(s1);
		
		System.out.println(sb1.reverse());
		
		StringBuffer sb2 = new StringBuffer("Awasthi");
		String s2 = sb2.toString();
		
		System.out.println(s2.compareTo(s1));
		
		
		StringBuffer sb3 = new StringBuffer("Awasthi");
		StringBuffer sb4 = new StringBuffer("Awasthi");
		
		System.out.println(sb3.equals(sb4));
		System.out.println(sb3==sb4);
		
		String s3 = "Pawan";
		String s4 = "Pawan";
		
		System.out.println(s3.equals(s4));
		System.out.println(s3==s4);
		
		

	}

}
