package Assignment3;

import java.util.Scanner;

public class LinkedList {

	
	static class Node{
		private int data;
		private Node next;
		
		public Node(int value){
			data=value;
		    next=null;
		}

		public Node() {
			// TODO Auto-generated constructor stub
		}
		
	}
	
	private Node head;
	public boolean isEmpty() {
		return head==null;
	}
	
	public LinkedList() {
		head=null;
	}
	
	   
		public void InsertAtFirst(int value) {
			Node newnode = new Node(value);
			
			if(isEmpty()) {
				head=newnode;
			}
			newnode.next=head;
			head=newnode;
			
		}
		public void InsertAtLast(int value) {
			Node newnode =new Node(value);
			
			if(isEmpty()) {
				head=newnode;
			}
			else {
			Node trav=head;
			while(trav.next!=null) {
				trav=trav.next;
			}
			trav.next=newnode;
		}
		}
		public void add(int value) {
			Node newnode =new Node(value);
	    	newnode.next=head;
	    	head=newnode;			
		}
		
		public void display() {
			Node trav=head;
			while(trav!=null) {
				System.out.println(trav.data);
				trav=trav.next;
			}
		}
		
	}
