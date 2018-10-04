package example.corejava.stringoperation;

public class HowToCountNumberOfWordsInGivenString {

	public static void main(String[] args) {
		
		doCountWordsByArrayLengthMethods("Pawan awasthi is a good developer");
		doCountWords("Pawan awasthi is a good developer");

	}

	private static void doCountWords(String string) {
		
		string=string.trim();
		int count=1;
		for(int i =0;i<string.length()-1;i++){
			if(string.charAt(i)!=' ' && string.charAt(i+1) ==' '){
				count++;
			}
		}
		System.out.println("Number Of Words : "+count);
		
	}

	private static void doCountWordsByArrayLengthMethods(String string) {

		String[] str = string.split(" ");
		System.out.println("Number Of Words : "+str.length);
		
	}

}
