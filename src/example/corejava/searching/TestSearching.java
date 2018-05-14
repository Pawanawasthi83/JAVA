package example.corejava.searching;

public class TestSearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Searching sObj = new Searching();
		boolean ispresentLS = sObj.linearSearch(new int[]{11, 12, 22, 25, 34, 64, 90},11);
		
		if(ispresentLS){
			System.out.println("Element is Present");
		}else {
			System.out.println("Element is Not Present");
		}
		
		boolean ispresentBS = sObj.BinarySearch(new int[]{64, 34, 25, 12, 22, 11, 90},90);
		
		if(ispresentBS){
			System.out.println("Element is Present");
		}else {
			System.out.println("Element is Not Present");
		}
	}

}
