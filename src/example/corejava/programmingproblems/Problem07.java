package example.corejava.programmingproblems;

public class Problem07 {

	public static void main(String[] args) {
		
		for(int i=1;i<=7;i++){
			for(int j=7;j>i;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print("&");
			}
			for(int k=1;k<=i;k++){
				System.out.print("&");
			}
			System.out.println();
			
		}
		System.out.println();
		System.out.println("#");
		for(int i=1;i<=7;i++){
			for(int j=7;j>i;j--){
				System.out.print(" ");
			}
			System.out.print("#");
			for(int k=1;k<=i;k++){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print(" ");
			}
			System.out.println("#");
			
		}
		
		for(int l=16;l>=1;l--){
			
			System.out.print("#");
		}

	}

}
