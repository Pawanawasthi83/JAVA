package example.corejava.stringoperation;

public class ConvertStringToInteger {

	public static void main(String[] args) {
		
		String str = "123456";
		
		int i = Integer.valueOf(str);
		int j = Integer.parseInt(str);
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(i+j);

	}

}
