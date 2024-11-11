package Assignment3;

import java.util.Arrays;

public class Stack 
{
	private int top;
	private int arr[];
	private final int SIZE;

	
	public Stack(int size) 
	{
		top=-1;
		SIZE=size;
		arr=new int[SIZE];
	}
	


	public boolean isEmpty() 
	{
		return top==-1;
	}
	
	public boolean isFull() 
	{
		return top==SIZE-1;
	}
	public void push(int value) 
	
	{
		if(isFull()) {
			return;
		}
		else {
			top++;
			arr[top]=value;
		}
		
	}
	
	public int pop()
	{   int temp=arr[top];
	    top--;
		return temp;
	}

	public int peek() 
	{
		return arr[top];
	}



	public int[] getArr() {
		return arr;
	}



	public void setArr(int[] arr) {
		this.arr = arr;
	}


	public void display() {
	for(int i=0;i<=SIZE-1;i++) {
		System.out.print(" "+arr[i]);
	}
	System.out.println(" ");
	}
	
	
}




