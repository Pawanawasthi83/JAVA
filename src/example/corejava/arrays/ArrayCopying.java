package example.corejava.arrays;

import java.util.Arrays;

public class ArrayCopying {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={1,22,3,33,5};
		int b[];
		b=a; //both the array variables(a and b) are pointing to same object in the memory.
		for(int x=0;x<b.length;x++	){
			System.out.println("Value of the element in array b[] at index "+x+" : "+b[x]);
		}
		a[1]=56;
		//Changing value of element of array 'a' will also reflect in array 'b'
		System.out.println("Value of index 1 in Array a[] : "+a[1]);
		System.out.println("Value of index 1 in Array b[] : "+b[1]);
		
		System.out.println("Method 1 : Copying An Array Using for Loop");
		
		int i[]={12,23,45,65,78,98,70};
		int j[]=new int[i.length];
		
		
		for(int y=0;y<i.length;y++){
			j[y]=i[y];
			System.out.println(j[y]);
		}
		
		//Now changing values of one array will not reflect in another array
		i[0]=99;
		System.out.println(j[0]);
		
		System.out.println("Method 2 :Copying An Array Using copyOf() Method of java.util.Array Class");
		
		int c[]={82,23,32,55,67,2,7,8};
		int d[]=Arrays.copyOf(c, c.length);
		
		//Now changing values of one array will not reflect in other array
		 
        c[3] = 56;       //Changing value of 3rd element in array 'c'
 
        System.out.println(c[3]);
        System.out.println(d[3]);    //value of 3rd element in array 'd' will not change
 
        System.out.println("Method 3 :Copying An Array Using clone() Method");
        
        int m[]={12,3,4,583,4,343};
        int n[]=m.clone();
        
      //Now changing values of one array will not reflect in other array
		m[3]=44;
		System.out.println(m[3]);
        System.out.println(n[3]);    //value of 3rd element in array 'd' will not change
 
        System.out.println("Method 4 :Copying An Array Using arraycopy() Method Of System Class");
        String[] s ={"Durga","PAwan","Awasthi"};
        String[] t = new String[s.length];
        System.arraycopy(s, 0, t, 0, t.length);
        
        s[0]="Avyak";
        System.out.println(s[0]);
        System.out.println(t[0]);    //value of 3rd element in array 'd' will not change
        
        
        		
        
        
	}

}
