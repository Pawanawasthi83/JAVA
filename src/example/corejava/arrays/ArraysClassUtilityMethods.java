package example.corejava.arrays;

import java.util.Arrays;

class XYZ {
	int number;
	String name;

	public static void M1() {
		System.out.println("I Side M1 Method");
	}
}

public class ArraysClassUtilityMethods {

	public static void main(String[] args) {
		
//		toString() method of Arrays class is used to display all elements of an array

		int[] a = {12,21,3,4,15};
		System.out.println(Arrays.toString(a));
		boolean[] boo = {true,false,true,true};
		System.out.println(Arrays.toString(boo));
		char[] ch = {'t','s','a','b','n','m'};
		System.out.println(Arrays.toString(ch));
		String[] str={"Pawan","Awasthi","Priyanka","Avyak"};
		System.out.println(Arrays.toString(str));
		Object[] obj ={new XYZ()};
		System.out.println(Arrays.toString(obj));
		XYZ x = (XYZ) obj[0];
		x.M1();
		
//		sort() method sorts elements of an array in ascending order.
//		This method internally uses quiksort algorithm to sort the elements.
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
//		The range to be sorted extends from the index fromIndex, inclusive, to the index toIndex, exclusive
		Arrays.sort(ch, 1, 3);
		System.out.println(Arrays.toString(ch));
//		There is no sort method in Arrays class which sorts boolean type array
		//Arrays.sort(boo);

//		binarySearch() Searches the specified value in the array by using the binary search algorithm
//		If the value is found in the array, it returns index of that value in the array. 
//		If not found, it returns insertion point.
//		no binarySearch() method boolean array
//		multiple elements with same value, there is no guarantee which one will be found
		
		int j[] = {5,7,8,45,23,0,98,9,76,5,4};
		Arrays.sort(j);
		System.out.println(Arrays.toString(j));
		
		System.out.println(Arrays.binarySearch(j, 45));
		System.out.println(Arrays.binarySearch(j, 5));
		System.out.println(Arrays.binarySearch(j, 100));
		System.out.println(Arrays.binarySearch(j, 0, 8, 45));
		
//		fill() method assigns specified value to each element of an array
		
		String[] val = new String[5];
		Arrays.fill(val,"Pawan");
		System.out.println(Arrays.toString(val));
		Arrays.fill(val,0,2,"Awasthi");
		System.out.println(Arrays.toString(val));
		
//		copyof() copies the specified array into new array of same type
		
		int[] i1= Arrays.copyOf(j, 5);
		System.out.println(Arrays.toString(i1));
		
		int[] i2 = Arrays.copyOfRange(j, 2, 25);
		System.out.println(Arrays.toString(i2));
		
//		Returns true if the two specified arrays of ints are equal to one another. 
//		two arrays are equal if they contain the same elements in the same order. 
//		Also, two array references are considered equal if both are null.
		int[] a1 ={1,2,3};
		int[] a2 ={1,2,3};
		System.out.println(Arrays.equals(a1, a2));
		System.out.println(Arrays.hashCode(a1));
		System.out.println(Arrays.hashCode(a2));
	}

}
