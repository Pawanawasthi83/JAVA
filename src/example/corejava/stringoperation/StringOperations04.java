package example.corejava.stringoperation;

public class StringOperations04 {

	StringOperations04(String str){}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringOperations04 t1 = new StringOperations04("ratan");
		StringOperations04 t2 = new StringOperations04("ratan");
		System.out.println(t1.equals(t2));
		System.out.println(t1==t2);
		
		String s1 = "anu";
		String s2 = "anu";
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		StringBuffer sb1 = new StringBuffer("gurga");
		StringBuffer sb2 = new StringBuffer("gurga");
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1==sb2);
	}

}
