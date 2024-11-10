package Assignment2;

public class LinearQueue {

	private int front;
	private int rear;
	private int arr[];
	private final int SIZE;
	
	public LinearQueue(int size){
		SIZE=size;
		front=rear=0;
		arr=new int[SIZE];
	}
	
	public boolean isEmpty() {
		return rear == 0;
	}
	
	public boolean isFull() {
		return rear ==SIZE-1;
	}
	
	public void push(int value) {
		rear=rear+1;
		arr[rear]=value;
	}
	
	public void pop() {
		front=front+1;
		
	}
	public int peek() {
		return arr[front+1];
	}
	
	public void display() {
		for(int i=front+1;i<rear;i++) {
			System.out.println(arr[i]);
		}
	}
}
