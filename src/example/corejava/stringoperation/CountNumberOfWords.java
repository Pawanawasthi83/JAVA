package example.corejava.stringoperation;

import java.util.Scanner;

public class CountNumberOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string...");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(str);
		String [] arrStr=str.split(" ");
		System.out.println("Number of Words:"+arrStr.length);
		
		int count =1;
		for(int i=0;i<str.length()-1;i++){
			if(str.charAt(i)!=' ' && str.charAt(i+1)==' '){
				count++;
			}
		}
		System.out.println("Number of Words:"+count);
		
	}

}
