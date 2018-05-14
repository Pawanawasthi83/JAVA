package example.corejava.arrays;

class A{
	
	public void methosone() {
		System.out.println("Method Call for Class A");
	}
	
}

class B extends A{
	
	public void methosone() {
		System.out.println("Method Call for Class b");
		
	}
	
}
public class ArrayOfObjects {

	public static void main(String[] args) {
		
		A[] userDefinedObject=new A[5];
		for(int i=0;i<userDefinedObject.length;i++){
			
			userDefinedObject[i]=new B();
		}
		
		userDefinedObject[1].methosone();

	}

}
