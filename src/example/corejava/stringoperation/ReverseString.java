package example.corejava.stringoperation;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reverseStringBuffer("Pawan");
		reverseIterativeMethod("Awasthi");
		reverseIterativeMethod2("Awasthi");
		System.out.println(reverseRecursiveMethod("java"));
		
	}

	public static void reverseStringBuffer(String s1) {
		
		StringBuffer sb = new StringBuffer(s1);
		System.out.println(sb.reverse());
		
	}
	public static void reverseIterativeMethod(String s1) {
		String str = "";
		char[] charArray = s1.toCharArray();
		for(int i=charArray.length-1;i>=0;i--){
			
			str=str+charArray[i];
		}
		System.out.println(str);
	}
	public static void reverseIterativeMethod2(String s1) {
		String str = s1;
		String rStr="";
		for(int i=str.length()-1;i>=0;i--){
			rStr=rStr+str.charAt(i);
		}
		System.out.println(rStr);
	}
	
	static String reverseRecursiveMethod(String str) {
		
		if ((null == str) || (str.length() <= 1))
	     {
	            return str;
	     }
		System.out.println("=="+str);
		return reverseRecursiveMethod(str.substring(1))+str.charAt(0);	
		}

}
