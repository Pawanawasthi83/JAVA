package example.corejava.regularexpresions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimplePatternMatching {

	public static void main(String[] args) {
		
		
		Pattern p = Pattern.compile("\\s");
		Matcher m =p.matcher("  Core Java jsp servlets             jdbc struts hibernate spring  ");
		System.out.println(m.toString());
		int count=0;
		
		while (m.find()) {
			System.out.println(m.start()+"---"+m.end()+"---"+m.group());
			count++;
		}
		
		System.out.println("Number of Pattern Matched : "+count);
		System.out.println(m.replaceAll(""));
		
	}

}
