package example.corejava.programmingproblems;

public class Problem01 {

	public static void main(String[] args) {
		for(int i=1;i<=6;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			for(int k=6;k>i;k--){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	
		for(int i=6;i>=1;i--){
			for(int j=1;j<i;j++){
				System.out.print(j);
			}
			for(int k=6;k>=i;k--){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println();
		System.out.print("@");
		System.out.println();
		for(int i=1;i<=5;i++){
			System.out.print("@");
			for(int j=1;j<=i;j++){
				System.out.print(" ");	
			}
			System.out.println("@");
		}
		for(int k=1;k<=7;k++){
			System.out.print("@");
		}
		System.out.println();
		
	}

}
