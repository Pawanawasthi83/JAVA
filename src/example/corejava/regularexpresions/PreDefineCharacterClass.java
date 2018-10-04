package example.corejava.regularexpresions;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PreDefineCharacterClass {

	public static void main(String[] args) {
		
		//Pattern p = Pattern.compile("\\s");
		//Pattern p = Pattern.compile("\\S");
		//Pattern p = Pattern.compile("\\d");
		//Pattern p = Pattern.compile("\\D");
		//Pattern p = Pattern.compile("\\w");
		Pattern p = Pattern.compile("\\s");
		
		Matcher m = p.matcher("a3#@4bc enoAB*09z");
		
		String[] arr = p.split("a3#@4bc enoAB*09z");
		System.out.println(Arrays.toString(arr));
		
		int count=0;
		while(m.find())
		{
			System.out.println(m.start()+"----"+m.group());
			count++;
		}
		System.out.println("Number Of Occurence : "+count);
		

	}

}
