package example.corejava.datastructures;

public class PersonStack {

	int maxsize;
	int top;
	public Person[] stack ;
	
	public PersonStack(int n) {
		this.maxsize=n;
		top=-1;
		stack=new Person[this.maxsize];
						
	}
	
	public boolean isFull(){
		return (top==this.maxsize-1);
	}
	
	public boolean isEmpty(){
		return (top==-1);
	}
	
	public void push(Person item ) {
		if(!isFull()){
			top++;
			stack[top]=item;
			
		}else{
			
			System.out.println("Stack is over flow");
		}
	}
	
	public Person pop() {
		if(!isEmpty()){
			Person temp=stack[top];
			stack[top]=null;
			top--;
			return temp;
		}else{
			System.out.println("Stack is Empty");
			return null;
		}
		
	}
	
	
}
