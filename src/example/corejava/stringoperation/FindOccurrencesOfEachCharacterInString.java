package example.corejava.stringoperation;

import java.util.HashMap;
import java.util.Map.Entry;

public class FindOccurrencesOfEachCharacterInString {

	public static void main(String[] args) {
		
		String str = "pawan pawan is a good boy";
		String strcopy = str.replaceAll("\\s", "");
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<strcopy.length();i++){
			if(map.containsKey(strcopy.charAt(i))){
				map.put(strcopy.charAt(i),map.get(strcopy.charAt(i))+1);
			}else{
				map.put(strcopy.charAt(i), 1);
				
			}
		}
		
		for(Entry<Character, Integer> m : map.entrySet()){
			
			System.out.println(m.getKey()+" : "+m.getValue());
			
		}
		
	}

}
