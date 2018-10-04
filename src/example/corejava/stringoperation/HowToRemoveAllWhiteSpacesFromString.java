package example.corejava.stringoperation;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.border.MatteBorder;

public class HowToRemoveAllWhiteSpacesFromString {

	public static void main(String[] args) {

		String str = "I am a good		Programmer";
		System.out.println(removeWhiteSpacesByCharArray(str));
		System.out.println(removeWhiteSpacesByStringMethods(str));
		System.out.println(removeWhiteSpacesByStringReplaceAll(str));
		System.out.println(removeWhiteSpacesByPatternReplaceAll(str));
		

	}

	private static String removeWhiteSpacesByPatternReplaceAll(String str) {
		Pattern p = Pattern.compile("\\s");
		Matcher m =p.matcher(str);
		String s1 = m.replaceAll("");
		return s1;
	}

	private static String removeWhiteSpacesByStringReplaceAll(String str) {
		
		String s1 = str.replaceAll("\\s", "");
		return s1;
	}

	private static String removeWhiteSpacesByStringMethods(String str) {
		
		String s1="";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=' ' && str.charAt(i)!='\t' ){
				s1=s1+str.charAt(i);
			}
		}
		return s1;
	}

	private static String removeWhiteSpacesByCharArray(String str) {
		char[] charArr = str.toCharArray();
		String s1 = "";
		for (int i = 0; i < charArr.length; i++) {
			if (charArr[i] != ' ' && charArr[i]!='\t') {
				s1 = s1 + charArr[i];
			}
		}
		return s1;
	}

}
