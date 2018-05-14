package example.corejava.stringoperation;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindDuplicateCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateCharsCount("Better Butter");
	}
	
	public static void DuplicateCharsCount(String str) {
		
		String s1 = str.replaceAll("\\s", "");
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0;i<s1.length();i++){
			
			if(map.containsKey(s1.charAt(i))){
				map.put(s1.charAt(i), map.get(s1.charAt(i))+1);
			}else{
				map.put(s1.charAt(i), 1);
			}
		}
		
		for(Entry<Character, Integer> m:map.entrySet()){
			if(m.getValue()>1){
			System.out.println(m.getKey()+" : "+m.getValue());
		}}
	}

}
