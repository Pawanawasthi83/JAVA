package example.corejava.arrays;

public class HowToFindAllTheLeadersInArray {

	public static void main(String[] args) {
		
		findTheLeaders(new int[] {12, 0, 7, 5, 8, 6, 3});
		
	}

	public static void findTheLeaders(int[] a){
		
		int max = a[a.length-1];
		System.out.println(max);
		for(int i=a.length-2;i>=0;i-- ){
			if(a[i]>max){
				System.out.println(a[i]);
				max=a[i];
			}
		}
				
		
	}

}
