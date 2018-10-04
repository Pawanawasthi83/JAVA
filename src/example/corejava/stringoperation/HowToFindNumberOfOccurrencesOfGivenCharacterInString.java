package example.corejava.stringoperation;

public class HowToFindNumberOfOccurrencesOfGivenCharacterInString {

	public static void main(String[] args) {
		
		String str = "Java is java again java again";
		String c ="a";
		int count=str.length()- str.replace(c,"").length();
		System.out.println(count);
	}

}
