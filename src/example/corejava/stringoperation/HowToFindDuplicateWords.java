package example.corejava.stringoperation;

import java.util.HashMap;
import java.util.Map.Entry;

public class HowToFindDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getDuplicateWord("java is java again java is");
	}

	private static void getDuplicateWord(String string) {

		String[] str = string.split("\\s");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String string2 : str) {
			if (map.containsKey(string2)) {
				map.put(string2,map.get(string2)+1);
			} else {
				map.put(string2, 1);
			}
		}
		
		for (Entry<String, Integer> e : map.entrySet()) {
			if(e.getValue()>1){
				System.out.println(e.getKey()+"===="+e.getValue());
			}
		}
	}

}
