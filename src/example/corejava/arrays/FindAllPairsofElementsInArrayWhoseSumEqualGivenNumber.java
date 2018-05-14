package example.corejava.arrays;

public class FindAllPairsofElementsInArrayWhoseSumEqualGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		findThePairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);
			
		
	}

	private static void findThePairs(int[] is, int num) {
		// TODO Auto-generated method stub
		int[] arr =is;
		int number=num;
		System.out.println("Pairs of elements whose sum is "+number+" are : ");
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if((arr[i]+arr[j])==number){
					System.out.println("Pair is {"+arr[i]+","+arr[j]+"}");
				}
			}
		}
	}

}
