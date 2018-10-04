package example.corejava.regularexpresions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GreedyQuantifiers {

	public static void main(String[] args) {
		
//		Pattern p = Pattern.compile("a");
//		Pattern p = Pattern.compile("a+");
//		Pattern p = Pattern.compile("a*");
//		Pattern p = Pattern.compile("a?");
		Pattern p = Pattern.compile("a{2,3}");
		
		Matcher m = p.matcher("abaabaaabaaaab");
		
		while(m.find()){
			System.out.println(m.start()+"===="+m.group());
		}

	}

}
