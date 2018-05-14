package example.corejava.datastructures;

import java.util.Arrays;

public class Stack {
	int maxSize;
	static Object[] mystack;
	int top;
	
	public Stack(int s) {
		this.maxSize=s;
		mystack=new Object[maxSize];
		top=-1;
	}
	
	public void push(Object j) {
		if(!isFull()){
			top++;
			mystack[top]=j;
		}
	}
	
	public Object pop() {
		if(!isEmpety()){
			return mystack[top--];
		}
		return maxSize;
	}
	public Object peek() {
		return mystack[top];
	}
	
	public boolean isEmpety(){
		return (top==-1);
	}
	
	public boolean isFull(){
		return (top==maxSize-1);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack=new Stack(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.push("ABC");
		System.err.println(Arrays.toString(mystack));
		stack.pop();
		stack.push(10);
		
		System.err.println(Arrays.toString(mystack));
		
	}

}
