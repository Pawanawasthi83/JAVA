package example.corejava.programmingproblems;

import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=2,large=0,small=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter : ");
		int a=sc.nextInt();
		
		small=a;
		large=a;
		
		while(i<10){
			System.out.println("Enter number : "+i);
			int k=sc.nextInt();
			if(k<small){
				small=k;
			}
			if(k>large){
				large=k;
			}
			
			i++;
		}
		
		System.out.println("Larger: "+large);
		System.out.println("Smaller: "+small);
		
	}

}

