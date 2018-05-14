package example.corejava.stringoperation;

public class StringoOperation02 {

	public static void main(String[] args) {
		
		String s1 = new String("Pawan");

		String s2 = new String("Pawan");
		
		System.out.println(s1==s2);
		s1.concat("Awasthi");
		System.out.println("==="+s1);
		
		System.out.println(s1==s2);

		String s3 = "Pawan";

		String s4 = "Pawan";
		
		System.out.println(s3==s4);

	}

}
