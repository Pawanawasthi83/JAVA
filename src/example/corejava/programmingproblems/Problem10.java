package example.corejava.programmingproblems;

import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int a = sc.nextInt();
		System.out.println("Enter Second Number : ");
		int sum=0;
		int multile = 1;
		int b = sc.nextInt();
		
		if(a>b){
			System.out.println("First number cant be greater than second number");
		}else{
			for(int i =a+1;i<b;i++){
				sum=sum+i;
				multile=multile*i;
			}
		}
		System.out.println(sum+" "+multile);
	}

}
