package example.corejava.stringoperation;

import java.util.Arrays;

public class HowToReverseEachWordOfGivenString {

	public static void main(String[] args) {
		
		doreverseEachWordInString("Pawan is good java programmer");

	}

	private static void doreverseEachWordInString(String string) {
		
		String[] inputArr=string.split(" ");
		String outputString="";
		
		for(int i=0;i<inputArr.length;i++){
			
			for(int j=inputArr[i].length()-1;j>=0;j--){
				outputString=outputString+inputArr[i].charAt(j);
			}outputString=outputString+" ";
			
		}System.out.println(outputString);
		
		
		
	}

}
