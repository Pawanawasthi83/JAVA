package example.corejava.collections;

import java.util.ArrayList;

public class ConversionCollectionToArrays {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Pawan");
		al.add("Ratan");
		al.add("John");
		al.add("Ram");
		
		String[] s=new String[al.size()];
		
		al.toArray(s);
		
		for(String ss:s){
			System.out.println(ss);
		}
		
		ArrayList a1= new ArrayList();
		a1.add(10);
		a1.add(10.5);
		a1.add("John");
		a1.add(true);
		
		
		Object[] oo =new Object[a1.size()];
		a1.toArray(oo);
		
		for(Object o:oo){
			System.out.println(o);
		}
		
		
		
	}

}
