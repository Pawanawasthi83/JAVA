package example.corejava.stringoperation;

public class ReverseGivenStringWithPreservingThePositionOfSpaces {

	public static void main(String[] args) {
		
		reverseString("I Am Not String");

	}

	private static void reverseString(String inputString) {
		
		char[] inputStringArray=inputString.toCharArray();
		char[] resultArray = new char[inputStringArray.length];
		
		for(int i =0;i<inputStringArray.length;i++){
			if(inputStringArray[i]==' '){
				
				resultArray[i]=' ';
			}
		}
		
		System.out.println(resultArray.length);
		int j=resultArray.length-1;
		
		for(int i =0;i<inputStringArray.length;i++){
			if(inputStringArray[i]!=' '){
				
				if(resultArray[j]==' '){
					j--;
				}
				resultArray[j]=inputStringArray[i];
				j--;
			}
		}
		
		System.out.println(String.valueOf(resultArray));
	}
	

}
