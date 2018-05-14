package example.corejava.programmingproblems;

import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base : ");
		int base = sc.nextInt();
		
		System.out.println("Enter Power : ");
		int power = sc.nextInt();
		int result=1;
		int i=1;
		while(i<=power){
			
			result=result*base;
			
			i++;
		}
		System.out.println(result);

	}

}
