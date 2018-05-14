package example.corejava.programmingproblems;

import java.util.Scanner;

public class Problem03 {

	public static void main(String[] args) {
		
		printSquare();

	}

	private static void printSquare() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Height :");
		int height=sc.nextInt();
		System.out.println("Width :");
		int width = sc.nextInt();
		
		for(int i=1;i<=height;i++){
			for(int j=1;j<=width;j++){
				System.out.print("B");
			}
			System.out.println();
		}
		
	}

}
