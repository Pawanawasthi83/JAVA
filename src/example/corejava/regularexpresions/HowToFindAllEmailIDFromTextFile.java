package example.corejava.regularexpresions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HowToFindAllEmailIDFromTextFile {

	public static void main(String[] args) throws IOException {
		
		
		Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z0-9]+)+");
		
		PrintWriter out = new PrintWriter(System.getProperty("user.dir")+File.separator+"src"
				+File.separator+"example"+File.separator+"corejava"+File.separator+"regularexpresions"+File.separator+"output.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.dir")+File.separator+"src"
		+File.separator+"example"+File.separator+"corejava"+File.separator+"regularexpresions"+File.separator+"input.txt"));
		
		String line = br.readLine();
		while(line!=null){
			
			Matcher m = p.matcher(line);
			while(m.find()){
				System.out.println(m.start()+"=="+m.group());
				out.println(m.group());
			}
			line=br.readLine();
		}
		out.flush();
		
	}

}
