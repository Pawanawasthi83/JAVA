package example.corejava.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuentinTarantino {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcases = Integer.parseInt(br.readLine());
		
		for(int i=0;i<testcases;i++){
		
		 int noofchapter = Integer.parseInt(br.readLine());
		
			String chapter = br.readLine();
			String chap[] = chapter.split(" ");
			int arr[]=new int[chap.length];
			for(int j=0;j<chap.length;j++){arr[j]=Integer.parseInt(chap[j]);}
			
			if(arr.length>noofchapter ||arr.length>noofchapter){System.out.println("NO 1");}
			else if(isSorted(arr)){System.out.println("NO 2");}
			else if (isgreater(arr, noofchapter)){System.out.println("NO 3");}
			else{System.out.println("Yes");}
				
		}

	}
	
	public static boolean isSorted(int[] a) 
	{
	    int i;
	    for(i = 0; i < a.length -1; i++){
	        if (a[i] > a[i+1]) {
	           return false;
	        }
	    }
		return true;
		
	}
	
	public static boolean isgreater(int[] a, int b ) 
	{

	    int i;
	    for(i = 0; i < a.length -1; i++){
	        if (a[i] > b) {
	            return true;
	        }
	    }
		return false;
	}
	
}
