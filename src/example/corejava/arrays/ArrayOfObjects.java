package example.corejava.arrays;

//Array can hold the references to any type of objects.
//Array can contain only references to the objects, 
//not the objects itself.

class A{
	String name;
	int rollnumber;
	
	A(){
		
	}
	A(String name,int number){
		this.name=name;
		this.rollnumber=number;
		System.out.println("In Side Argument Constructor");
	}
	void methodOne() {
		System.out.println("Method Call for Class A");
	}
	
}

class B extends A
{
    
	public B(String string, int i) {
		super(string,i);
	}

	@Override
    void methodOne()
    {
        System.out.println("From Class B");
    }
}


public class ArrayOfObjects {

	public static void main(String[] args) {
		
		A[] userDefinedObject=new A[5];
		for(int i=0;i<userDefinedObject.length;i++){
			
			userDefinedObject[i]=new B("pawan",10);
		}
		
		userDefinedObject[0].methodOne();
		System.out.println(userDefinedObject[0].rollnumber);
		System.out.println(userDefinedObject[0].name);

	}

}
