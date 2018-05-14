package example.corejava.collections;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Pawan");
		al.add("Amit");
		al.add("Durga");
		
		System.out.println(al);
		al.add(3, "El");
		System.out.println(al);
		al.add(0, "piya");
		System.out.println(al);
		
		ArrayList<String> al1 = new ArrayList<>(al);
		//al1.addAll(al);
		al1.add("Amu");
		al.addAll(al1);
		System.out.println(al);
	}

}
