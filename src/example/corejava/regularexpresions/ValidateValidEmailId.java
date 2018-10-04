package example.corejava.regularexpresions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateValidEmailId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++){
			
			String str = sc.nextLine();
			
			Pattern p = Pattern.compile("[0-9a-zA-z][0-9a-zA-Z_.]*@[0-9a-zA-Z]+([.][0-9a-zA-Z]+)+");
			Matcher m = p.matcher(str);
			
			if(m.find() && str.equals(m.group())){
				System.out.println("Valid Email id");
			}else{
				System.out.println("Invalid email id");
			}
			
			}
			
		sc.close();
		}
	}
