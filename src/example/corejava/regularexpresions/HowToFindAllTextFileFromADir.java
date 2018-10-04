package example.corejava.regularexpresions;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HowToFindAllTextFileFromADir {

	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
		File file = new File(System.getProperty("user.dir"));
		String[] fileArr = file.list();
		System.out.println(fileArr.length);
		Pattern pattern = Pattern.compile("[a-zA-Z0-9_.$]+[.]txt$");
		
		for (String string : fileArr) {
			
			Matcher m = pattern.matcher(string);
			if(m.find()){
				System.out.println(m.group());
			}
		
		}

	}

}
