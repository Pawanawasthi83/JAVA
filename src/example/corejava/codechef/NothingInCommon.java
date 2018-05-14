package example.corejava.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NothingInCommon {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcases = Integer.parseInt(br.readLine());
		
		System.out.println("Number OF Test Cases : "+testcases);
		
			for(int i=0;i<testcases;i++){
					
				int resCount=0;	
				String num = br.readLine();
				String[] ar = num.split(" ");
				
				int aNumber=Integer.parseInt(ar[0]);
				int bNumber=Integer.parseInt(ar[1]);
				System.out.println("Alice Number : "+aNumber);
				System.out.println("Berta  Number : "+bNumber);
				
				int a[]=new int[aNumber];
				int b[]=new int[bNumber];
				String aCollection = br.readLine();
				String bCollection = br.readLine();
				
				String alice[] =aCollection.split(" "); 
				String Berta[] =bCollection.split(" ");
				
				for(int j=0;j<alice.length;j++){a[j]=Integer.parseInt(alice[j]);}
				for(int k=0;k<Berta.length;k++){b[k]=Integer.parseInt(Berta[k]);}	
				
				for(int x=0;x<a.length;x++){
					for(int y=0;y<b.length;y++){
						if(a[x]==b[y]){
							resCount++;
						}
					}
					}
				System.out.println("Count to be removed : "+resCount);
				}
			}
	}

