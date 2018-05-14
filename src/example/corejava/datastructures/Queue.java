package example.corejava.datastructures;

import java.util.Arrays;

public class Queue {

	int size,totalElements,rear,front;
	int[] queue;
	
	public Queue(int x) {
		this.size=x;
		this.totalElements=0;
		this.rear=0;
		this.front=0;
		queue=new int[this.size];
	}
	public boolean isFull() {
		if(size==totalElements){
			return true;
		}else{
			return false;
		}
	}
	public boolean isEmpty() {
		if(totalElements==0){
			return true;
		}else{
			return false;
		}
	}
	public boolean enqueue(int item){
		if(!isFull()){
			queue[rear]=item;
			rear=(rear+1)%size;
			totalElements++;
			return true;
		}else{
			return false;
		}
	}
	public int dequeue() {
		 int item = queue[front];
		 queue[front]=0;
		 totalElements--;
		 front=(front+1)%size;
		 return item;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new Queue(5);
		
		q.enqueue(6);
		q.enqueue(9);
		q.enqueue(8);
		q.enqueue(5);
		q.enqueue(1);
		System.out.println(Arrays.toString(q.queue));
		System.out.println(q.dequeue());
		System.out.println(Arrays.toString(q.queue));
		System.out.println(q.dequeue());
		System.out.println(Arrays.toString(q.queue));
		System.out.println(q.dequeue());
		System.out.println(Arrays.toString(q.queue));
		System.out.println(q.dequeue());
		System.out.println(Arrays.toString(q.queue));
		System.out.println(q.dequeue());
		System.out.println(Arrays.toString(q.queue));
		
		System.out.println(q.totalElements);
		
		q.enqueue(11);
		System.out.println(Arrays.toString(q.queue));
		q.enqueue(12);
		System.out.println(Arrays.toString(q.queue));
		q.enqueue(13);
		System.out.println(Arrays.toString(q.queue));
		
		System.out.println(q.dequeue());
		System.out.println(Arrays.toString(q.queue));
		
	}

}
