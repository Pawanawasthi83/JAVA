package example.corejava.stringoperation;

import java.util.Arrays;

public class StringClassMethods {

	public static void main(String[] args) {
		
		String str1 = "Java is Good Programming Language Java";
		
		//Returns the char value at the specified index.
		System.out.println(str1.charAt(0));
		
		//Returns the character (Unicode code point) at the specified index.
		System.out.println(str1.codePointAt(0));
		
		//Returns true if and only if this string contains the specified sequence of char values.
		System.out.println(str1.contains("Java"));
		
		//Returns the index within this string of the first occurrence of the specified character.
		System.out.println(str1.indexOf('P'));
		
		//Returns the index within this string of the first occurrence of the specified substring.
		System.out.println(str1.indexOf("Good"));
		
		
//		When the intern() method is invoked on a String object it looks the string contained by 
//		this String object in the pool, if the string is found there then the string from the pool
//		is returned. Otherwise, this String object is added to the pool and a reference to this 
//		String object is returned.
		System.out.println("====String Intern() Method====");
		String str2 = str1.intern();
		System.out.println(str2);
		System.out.println(str1==str2);
		
		String str3 = new String("PawanAwasthi");
		String str4 = str3.intern();//Will search in String literal pool 
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		
		String str5 = str4.intern();
		System.out.println(str5==str4);
		System.out.println(str5.equals(str4));
		
		//Returns the length of this string.
		System.out.println(str1.length());
		
		//Returns true if, and only if, length() is 0.
		System.out.println(str1.isEmpty());
		
		//Returns the index within this string of the last occurrence of the specified character.
		System.out.println(str3.lastIndexOf('a'));
		System.out.println(str1.lastIndexOf("java"));
		
		System.out.println("==Replace Method()==");
		
		//Returns a string resulting from replacing all occurrences of oldChar in this string with newChar.
		System.out.println(str1.replace('J', 'P'));
		System.out.println(str1.replace("Java", "Pawan"));
		
		System.out.println("==String split()==");
		//Splits this string around matches of the given regular expression.
		String[] arr = str1.split(" ");
		System.out.println(Arrays.toString(arr));
		
		System.out.println(arr[0]);
		
		//Tests if this string starts with the specified prefix.
		
		System.out.println(str1.startsWith("Ja"));
		System.out.println(str1.endsWith("va"));
		
		//Returns a string that is a substring of this string.
		
		System.out.println(str1.substring(5));
		System.out.println(str1.substring(3,14));
		
		
		//Converts this string to a new character array.
		char[] chs = str1.toCharArray();
		System.out.println(chs[0]);
		
		
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		int i =7;
		System.out.println(String.valueOf(i));
		
		System.out.println("===Integer To String Conversion===");
		int j = 12345;
		
		String s1 = String.valueOf(j);
		
		String s2 = Integer.toString(j);
		
		System.out.println("===String To Integer Conversion===");
		
		System.out.println(Integer.parseInt(s1));
		int k=Integer.valueOf(s2);
		System.out.println(Integer.valueOf(s2));
	}

}
