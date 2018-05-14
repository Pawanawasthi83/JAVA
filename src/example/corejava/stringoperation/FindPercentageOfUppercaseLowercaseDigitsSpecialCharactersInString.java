package example.corejava.stringoperation;

import java.text.DecimalFormat;
import java.util.Formatter;

public class FindPercentageOfUppercaseLowercaseDigitsSpecialCharactersInString {

	public static void main(String[] args) {
		

		characterPercentage("Tiger Runs @ The Speed Of 100 km/hour.");
	}

	private static void characterPercentage(String inputString) {
		
		int totalChar=inputString.length();
		
		int countUppercaseLetters =0;
		int countLowercaseLetters =0;
		int countDigits=0;
		int countSecialCharacters=0;
		
		for(int i=0;i<inputString.length();i++){
			
			if(Character.isUpperCase(inputString.charAt(i))){
				countUppercaseLetters++;
			}else if(Character.isLowerCase(inputString.charAt(i))){
				countLowercaseLetters++;
			}else if (Character.isDigit(inputString.charAt(i))) {
				countDigits++;
			}else {
				countSecialCharacters++;
			}
			
		}
		
		double percentagetUppercaseLetters=(countUppercaseLetters*100.0)/totalChar;
		double percentagetLowercaseLetters=(countLowercaseLetters*100.0)/totalChar;
		double percentagetDigits=(countDigits*100.0)/totalChar;
		double percentagetSecialCharacters=(countSecialCharacters*100.0)/totalChar;
		
		DecimalFormat formatter = new DecimalFormat("##.##");
		
		System.out.println("In '"+inputString+"' : ");
        
        System.out.println("Uppercase letters are "+formatter.format(percentagetUppercaseLetters)+"% ");
         
        System.out.println("Lowercase letters are "+formatter.format(percentagetLowercaseLetters)+"%");
         
        System.out.println("Digits Are "+formatter.format(percentagetDigits)+"%");
         
        System.out.println("Other Characters Are "+formatter.format(percentagetSecialCharacters)+"%");
         
        System.out.println("-----------------------------");
		
		
		
	}
	
	

}
