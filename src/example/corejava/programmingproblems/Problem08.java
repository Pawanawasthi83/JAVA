package example.corejava.programmingproblems;

import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int a = sc.nextInt();
		boolean prime =true;
		for(int i=2;i<a/2;i++){
			if(a%i==0){
				prime=false;
				break;
			}
		}
		
		if(prime){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}

}
