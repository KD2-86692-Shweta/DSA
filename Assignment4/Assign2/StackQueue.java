package Assignment4;

public class StackQueue {
         static class Node{
        	 private int data;
        	private  Node next;
        	public Node(int value) {
        		data=value;
        		next=null;
        	}
         }
         
         private Node head;
         
         public StackQueue(){
        	 head=null;
         }
         
         public void push(int value) {
        	 Node newnode=new Node(value);
        	 
        	 if(head==null) {
        		 head=newnode;
        		 newnode.next=null;
        	 }
        	 else {
        		 newnode.next=head;
        		 head=newnode;
        	 }
         }
         
         public void pop() {
        	 if(head==null)
        		System.out.println("Stack is empty");
        	 else {
        		 head=head.next;
        	 }
        				
         }
         
         public void peek() {
        	 if(head==null)
        		 return;
        	 else {
        		 System.out.println(head.data);
        	 }
         }
         
         public void display() {
        	 Node trav=head;
        	while(trav.next!=null) {
        		System.out.println(trav.data);
        		trav=trav.next;
        	}
         }
         
         public void pushQueue(int value) {
        	 
        	 Node newnode=new Node(value);
        	 if(head==null) {
        	 newnode.next=null;
        	 head=newnode;
        	 
        	 }
        	 else {
        		 newnode.next=head;
        		 head=newnode;
        	 }
        	 
         }
         
         public void popQueue() {
        	 Node trav=head;
        	 
        	 if(head==null) {
        		 System.out.println("Queue is Empty ");
        	 }else {
        		 while(trav.next.next!=null) {
        			 trav=trav.next;
        		 }
        		 trav.next=null;
        	 }
         }
         
         public void queuepeek() {
        	 Node trav=head;
        	 while( trav.next!=null) {
        		 trav=trav.next;
        	 }
        	 System.out.println(trav.data);
         }
         
         public void displayQueue() {
        	 Node trav=head;
        	 while(trav!=null) {
        		 System.out.print(" "+trav.data);
        		 trav=trav.next;
        	 }
        	 System.out.println("");
        		 
         }
         
         
}
