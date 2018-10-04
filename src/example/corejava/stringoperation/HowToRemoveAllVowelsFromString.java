package example.corejava.stringoperation;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HowToRemoveAllVowelsFromString {

	public static void main(String[] args) {

		removeAllVowelsByUsingPattern("QUEUEING AIEEE COOEEING MIAOUED ZAOUIA");
		removeAllVowelsByUsingLoop("QUEUEING AIEEE COOEEING MIAOUED ZAOUIA");
	}

	private static void removeAllVowelsByUsingLoop(String string) {
		
		char[] vowel={'A','E','I','O','U'};
		
		for(int i=0;i<string.length();i++){
			if(Arrays.binarySearch(vowel, string.charAt(i))<0){
				System.out.print(string.charAt(i));
			}
		}
		
		
	}

	private static void removeAllVowelsByUsingPattern(String targetstring) {
		
		Pattern pattern = Pattern.compile("[AEIOU]");
		Matcher m = pattern.matcher(targetstring);
		String outstr = m.replaceAll("");
		System.out.println(outstr);

	}

}
