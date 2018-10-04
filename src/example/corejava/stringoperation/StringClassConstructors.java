package example.corejava.stringoperation;

public class StringClassConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = new String();// Empty String
		
		char [] chars = {'A','B','C'};
		String s2 = new String(chars);//character array as an argument.
		
		String s3 = new String("Pawan");//string as an argument.
		
		StringBuffer sb = new StringBuffer("abs");
		
		String s4= new String(sb);//StringBuffer type as an argument
		
		StringBuilder stb = new StringBuilder("DQI");
		
		String s5 = new String(stb);//StringBuilder type as an argument
				
		String str = "Java concept of the day";
		
		char[] charsarr = new char[10];
		
		str.getChars(0, 4, charsarr, 0);
		
		for(char c : charsarr){
			
			System.out.println(c);
		}
	}

}
