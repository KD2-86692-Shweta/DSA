package Assignment4;

public class SingluCircular {
	
	class Node{
		private int data;
		private Node next;
		
		Node(int value){
			data=value;
			next=null;
		}
	}
	private Node tail;
	private int size;
	
   public SingluCircular() {
	   tail=null;
	   size=0;
   }
   
   public boolean isEmpty() {
	   return tail==null;
	   
   }
   public void addFirst(int value) {
	   Node newnode=new Node(value);
	   if(isEmpty()) {
		   tail=newnode;
		   newnode.next=newnode;
	   }
	   else{
		 newnode.next=tail.next;
		 tail.next=newnode;
		 System.out.println("add first"+tail.data);
	   }
	   size++;
	   
   }
   
   public void addlast(int value) {
	   Node newnode = new Node(value);
	   
	   if(isEmpty()) {
		   tail=newnode;
		  newnode.next=newnode;
	   }
	   
	   else {
		   newnode.next=tail.next;
		   tail.next=newnode;
		   tail=newnode;
			 System.out.println("add last"+tail.data);

		   
	   }
	   size++;
   }
   
   public void deleteFirst() {
	   if(isEmpty()) {
		   return ;
	   }
	   else if(tail==tail.next){
		   tail=null;
	   }
	   else {
		   tail.next=tail.next.next;
			 System.out.println("delete first"+tail.data);

	   }
	   
	   size--;
   }
   
   public void deleteLast() {
	   if(isEmpty()) {
		   return;
	   }
	   else if(tail==tail.next) {
		   tail=null;
	   }else {
		   Node trav=tail;
		   
		  for(int i=1;i<size;i++) {
			  trav=trav.next;
		  }
		  trav.next=tail.next;
		
	   }
	   size--;
   }
   public void addAtPos(int value,int pos) {
	   Node newnode=new Node(value);
	   if(pos<0 || pos>size) {
		   return;
	   }
	   
	   else if(pos==1) {
		   addFirst(value);
		   return;
	   }
	   else if(pos==size) {
		   addlast(value);
		   return;
	   }
	   else {
		   Node trav=tail;
		   for(int i=1;i<pos;i++) {
			   trav=trav.next;
		   }
		   newnode.next=trav.next;
		   trav.next=newnode;
		   
	   }
	   size++;
	   
   }
   
   public void deleteAtPos(int pos) {
	   if(pos<0 || pos>size) {
		   return;
	   }
	   else if(tail==null) {
		   return;
	   }
	   if(pos==1) {
		   deleteFirst();
		   return;
	   }
	   if(pos==size) {
		   deleteLast();
		   return;
	   }
	   else {
		   Node trav=tail;
		  for(int i=1;i<pos;i++) { 
			  trav=trav.next;
		  }
		 trav.next=trav.next.next;
	   }
	   size--;
   }
   public void display() {
	   Node trav=tail.next;
	   for(int i=0;i<size;i++) {
		 
		  System.out.println(trav.data);
		  trav=trav.next;
	   }
   }
}
