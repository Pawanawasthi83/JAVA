package example.corejava.codechef;

public class FormPhrase {

	public static void main(String[] args) {
		
		String[] pet = {"Dog","Cat","Horse","Rat","Bird","Rabit"};
		
		int size = pet.length;
		System.out.println(Math.random()*size);
		int ram = (int)(Math.random()*size);
		System.out.println(ram);
		
		String phrase = pet[ram]+" "+"is a pet animal";
		System.out.println(phrase);

	}

}
