package example.corejava.stringoperation;

import java.util.LinkedHashMap;

public class FindLongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		longestSubstring("javaconceptoftheday");
        
	}

	private static void longestSubstring(String inputString) {
		
		char [] charArray= inputString.toCharArray();
		
		String longestSubString="";
		int longestSubStringlength=0;
		
		LinkedHashMap<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		
		for(int i=0;i<charArray.length;i++){
		
			char ch = charArray[i];
			if(!map.containsKey(ch)){
				map.put(ch, i);
			}else{
				i=map.get(ch);
				map.clear();
			}
			
			if(map.size()>longestSubStringlength){
				longestSubString=map.keySet().toString();
				longestSubStringlength=map.size();
			}
			
			
		}
		
		System.out.println(longestSubString);
		System.out.println(longestSubStringlength);
		
	}

}
