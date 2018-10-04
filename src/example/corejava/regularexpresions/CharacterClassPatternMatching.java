package example.corejava.regularexpresions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterClassPatternMatching {

	public static void main(String[] args) {
		
		//Pattern p = Pattern.compile("[abc]");
		//Pattern p = Pattern.compile("[^abc]");
		//Pattern p = Pattern.compile("[^0-9a-zA-Z]");
		//Pattern p = Pattern.compile("[a-de-z]");
		//Pattern p = Pattern.compile("\\s");
		//Pattern p = Pattern.compile("\\S");
		//Pattern p = Pattern.compile("\\d");
		//Pattern p = Pattern.compile("\\D");
		//Pattern p = Pattern.compile("\\w");
		Pattern p = Pattern.compile("\\s");
		
		Matcher m = p.matcher("a3#@4bc enoAB*09z");
		
		int count=0;
		while(m.find())
		{
			System.out.println(m.start()+"----"+m.group());
			count++;
		}
		System.out.println("Number Of Occurence : "+count);
		

	}

}
