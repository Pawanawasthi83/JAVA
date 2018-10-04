package example.corejava.regularexpresions;

import java.util.Arrays;
import java.util.regex.Pattern;

public class PatternClassSplitMethod {

	public static void main(String[] args) {
		
		Pattern p1 = Pattern.compile("\\s");
		String[] str1 = p1.split("I am a Good Programmer");
		
		System.out.println(Arrays.toString(str1));
		
		Pattern p2 = Pattern.compile("\\.");//[.]
		String[] str2 = p2.split("www.google.com");
		
		System.out.println(Arrays.toString(str2));
		

	}

}
