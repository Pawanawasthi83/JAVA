package example.corejava.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ConversionArraysToCollection {

	public static void main(String[] args) {
		
		String[] s = {"Pawan","Ratan","Anu"};
		
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(s));
		al.add("Awasthi");
		al.add("Ram");
		
		for(String str:al){
			System.out.println(str);
		}
		

	}

}
