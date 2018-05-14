package example.corejava.stringoperation;

public class ReverseEachWordOfGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		reverseEachWordOfString("Java Concept Of The Day");
	}

	private static void reverseEachWordOfString(String inputString) {
		
		String[] strArray = inputString.split(" ");
		String reverseString ="";
		
		for(String word:strArray){
			String str ="";
			for(int i=word.length()-1;i>=0;i--){
					
				str=str+word.charAt(i);
			}
			reverseString=reverseString+str+" ";	
		}
		
		System.out.println(reverseString);
		
		
		
	}

}
