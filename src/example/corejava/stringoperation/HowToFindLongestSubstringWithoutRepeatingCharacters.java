package example.corejava.stringoperation;

public class HowToFindLongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		String str = "java concept of the day";
		str=str.replaceAll("\\s", "");
		System.out.println(str);
		
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<str.length();j++){
				if(str.charAt(i)==str.charAt(j)){
					System.out.println(str.substring(i, j-1));
					
				}
			}
		}

	}

}
