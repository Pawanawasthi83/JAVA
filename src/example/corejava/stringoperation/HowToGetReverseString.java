package example.corejava.stringoperation;

public class HowToGetReverseString {

	public static void main(String[] args) {
		System.out.println(doStringReverse("pawan Awasthi"));
		System.out.println(doStringReverseRecursiveMethod("Java"));
		System.out.println(doStringReverseByReverseMethod("Email"));
	}

	private static String doStringReverseByReverseMethod(String string) {
		
		StringBuffer sf = new StringBuffer(string);
		String str = new String(sf.reverse());
		
		return str;
	}

	private static String doStringReverseRecursiveMethod(String string) {
		
		if (string.length() <= 1) {
			return string;
		}
		return doStringReverseRecursiveMethod(string.substring(1)) + string.charAt(0);
	}

	private static String doStringReverse(String str) {
		int length = str.length();
		String rStr = "";
		for (int i = length - 1; i >= 0; i--) {
			rStr = rStr + str.charAt(i);
		}
		return rStr;

	}

}
