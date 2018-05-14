package example.corejava.stringoperation;

public class NumberOfOccurrencesOfGivenCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Java is java again java again";
		
		String c="a";
		
		int count =s.length()-s.replace(c,"").length();
		
		System.out.println(count);
	}

}
