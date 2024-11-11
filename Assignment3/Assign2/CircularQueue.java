package Assignment3;

public class CircularQueue {

	public int arr[];
	private int front;
	private int rear;
	private final int SIZE;
	
	public CircularQueue(int size) {
		SIZE=size;
		front=rear=-1;
		arr=new int[SIZE];
	}
	
	public void push(int value) {
		rear=(rear+1)%SIZE;
	
		arr[rear]=value;
	}
	
	public void pop() {
		front=(front+1)%SIZE;
		if(front==rear) {
			front=rear=-1;
		}
	}
	
	public int peek() {
		return arr[(front+1)%SIZE];
	}
	
	public void display() {
		for(int i=front+1;i<=rear;i++) {
			System.out.println(arr[i]);
		}
	}
}
