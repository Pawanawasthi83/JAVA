package example.corejava.stringoperation;

public class StringOperations07 {

	public static void main(String[] args) {
		
		String str = "pawan";
		char[] ch = str.toCharArray();
		
		System.out.println(Character.toString(ch[0]));
		
		String str1 = ""+ch[1];
		System.out.println(str1);
		
		String str2 = new String(new char[]{ch[2]});
		System.out.println(str2);
		
		String str3 = String.valueOf(ch[3]);
		System.out.println(str3);
	}

}
