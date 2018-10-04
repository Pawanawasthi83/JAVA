package example.corejava.stringoperation;

import java.util.Arrays;

public class HowToReverseGivenStringWithPreservingThePositionOfSpaces {

	public static void main(String[] args) {
		
		doStringReverseWithPreservingSpacePosition("I am not a string");
	}

	private static void doStringReverseWithPreservingSpacePosition(String string) {
		
		char[] inputArr=string.toCharArray();
		char[] outputArr = new char[inputArr.length];
		
		for(int i=0;i<inputArr.length;i++){
			if(inputArr[i]==' '){
				outputArr[i]=' ';
			}
		}
		int j=inputArr.length-1;
		
		for(int i=0;i<inputArr.length;i++){
			if(inputArr[i]!=' '){
				if(outputArr[j]==' '){
					j--;
				}
				outputArr[j]=inputArr[i];
				j--;
				
			}
		}
		System.out.println(Arrays.toString(outputArr));
		
	}

}
