package example.corejava.stringoperation;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindDuplicateCharFromStringByMAP {

	public static void main(String[] args) {

		String str = "PAWANAWASTHIPAWANAWASTHI";
		Map <Character, Integer> m1 = new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++){
			if(m1.containsKey(str.charAt(i))){
				m1.put(str.charAt(i), (m1.get(str.charAt(i)))+1);
			}else{
				m1.put(str.charAt(i), 1);
				}
		}

		for(Entry<Character, Integer> m:m1.entrySet()){
			
			if(m.getValue()>1){
				
				System.out.println("Duplicate Char In String : "+m.getKey()+" "+"Count : "+m.getValue());
			}
			
		}
		
	}
}
