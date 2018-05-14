package example.corejava.stringoperation;

public class FindLargestNumberLessThanGivenNumberAndWithoutGivenDigit {

	public static void main(String[] args) {

		System.out.println(getLLessThanN(145, 4));
	}

	private static int getLLessThanN(int i, int j) {
		
		int number = i;
		char c =Integer.toString(j).charAt(0);
		
		for(i=number;i>=0;i--){
			
			String str = Integer.toString(i);
			int index = str.indexOf(c);
			if(index==-1){
				
				return i;
			}
			
		}
		return -i;
	}

}
