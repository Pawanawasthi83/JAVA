package example.corejava.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExtremeEncoding {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcases = Integer.parseInt(br.readLine());
		
		System.out.println("Number OF Test Cases : "+testcases);
		
		for(int i=0;i<testcases;i++){
			
			int len =Integer.parseInt(br.readLine());
			
			System.out.println("Lenth Of array : "+len);
			
			int a[] = new int[len];
			int b[] = new int[len];
			
			for (int j = 0; j < len; j++) {
				
                a[j]=Integer.parseInt(br.readLine());
                System.out.println("Array Element : " + a[j]);
            }
			
			for (int j = 0; j < len; j++) {
                b[j]=a[j]>>16;
				System.out.println("Bj:"+b[j]);
				System.out.println("AJ:"+a[j]);
				System.out.println("b[j]<<16 : "+ (b[j]<<16));
                a[j]=a[j]-(b[j]<<16);
                System.out.println("Original Element of first array : " + a[j]);
                System.out.println("Original Element of second array : " + b[j]);
            }
			
			
		}
		

	}

}
