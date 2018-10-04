package example.corejava.arrays;

import java.util.ArrayList;

//Array is a set of values where each value is identified by an index.
//You can make an array of int’s, double’s, boolean’s or any other types 
//but all the values of array must be of same type.
//The index of an array starts from 0.

public class ArrayDeclaringAndInitializing {

	public static void main(String[] args) {
		
		int[] arrayofInts;
		double arrayofDoubles[] = {10.8,23.1};
		String []arrayofStrings = new String[]{"Pawan"};
		
		//All array elements in the array object are initialized with default values.
		arrayofInts=new int[10];  //Instantiating an array of int using new operator
		
		//Initializing Array Elements  
		arrayofInts[0]=10;
		arrayofInts[1]=20;
		arrayofInts[2]=30;
		arrayofInts[3]=40;
		arrayofInts[4]=50;
				
		System.out.println(arrayofDoubles.length);
		System.out.println(arrayofDoubles[0]);
		
		System.out.println(arrayofStrings.length);
		System.out.println(arrayofStrings[0]);
		
		System.out.println(arrayofInts.length);
		System.out.println(arrayofInts[4]);
		
	}

}
