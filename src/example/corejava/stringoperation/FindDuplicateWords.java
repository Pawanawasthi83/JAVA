package example.corejava.stringoperation;

import java.util.HashMap;
import java.util.Map.Entry;

public class FindDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		duplicateWord("Java is java again java is");
		duplicateWord("Bread butter and bread");
		duplicateWord("Super Man Bat Man Spider Man");
	}
	
	public static void duplicateWord(String s1) {
		
		String inputString = s1.toLowerCase();
		String[] words = inputString.split(" ");
		
		HashMap<String, Integer> wordMap = new HashMap<String, Integer>();
		
		for(String word :words){
			if(wordMap.containsKey(word)){
				wordMap.put(word, wordMap.get(word)+1);
			}else{
				wordMap.put(word, 1);
			}
			
		}
		for(Entry<String, Integer> m :wordMap.entrySet() ){
			if(m.getValue()>1){
				System.out.println(m.getKey()+": "+m.getValue());
			}
		}
	}

}
