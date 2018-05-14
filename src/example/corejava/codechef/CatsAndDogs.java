package example.corejava.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CatsAndDogs {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader sr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(sr);
		
		System.out.println("Enter Number Of test Cases :");
		String test = br.readLine();
		String[] ar = test.split(" ");
		int T = Integer.parseInt(ar[0]);
		int i =1;
		while(i<=T){
			System.out.println("Enter Cat ,Dogs and Legs : ");
			String input = br.readLine();
			String[] arr = input.split(" ");
			int C = Integer.parseInt(arr[0]);
			int D = Integer.parseInt(arr[1]);
			int L = Integer.parseInt(arr[2]);
			int X = L/4;
			
			if(L%4 !=0){System.out.println("NO");
			}else if(X>C+D ||X<D){System.out.println("no");				
			}else {System.out.println("Yes");}
			i++;
			
		}
		System.out.println("Test Completed");
		
		
	}

}
