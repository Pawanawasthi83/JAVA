package example.corejava.regularexpresions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateValidMobileNumber {

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		Pattern p = Pattern.compile("(0|91)?[789][0-9]{9}");
		Matcher m = p.matcher(str);
		
		if(m.find() && str.equals(m.group())){
			System.out.println("Valid Mobile Number");
		}else{
			System.out.println("Invalid Mobile Number");
		}
		}
	}

}
