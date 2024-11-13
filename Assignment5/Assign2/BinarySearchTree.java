package Assignment5;

public class BinarySearchTree {
	static class Node{
		private int data;
		private Node left;
		private Node right;
		
		public Node(int value) {
			data=value;
			left=right=null;
			
		}
	}
	
	private Node root;
	public BinarySearchTree() {
		root=null;
	}
	
	public void addData(int value,Node trav) {
		Node nn=new Node(value);
		
		if(root==null) {
			root=nn;
		}
		else {
			
			if(value<trav.data) {
				if(trav.left==null)
				{
					trav.left=nn;
					return;
				}
				else {
						addData(value,trav.left);
					}
			}else {
				if(trav.right==null) {
					trav.right=nn;
					return;
				}else {
					addData(value,trav.right);
				}
			}
		}
	}
	public void addData1(int value) {
		 addData(value,root);
	}
	
	public void Search(int key,Node trav) {
		if(trav==null)
		{System.out.println("Key Not Found ");

			return ;
		}
		
		if(key==trav.data) {
			System.out.println("found");
		}else if(key<trav.data){
			Search(key,trav.left);
			
		}else if(key>trav.data){
			Search(key,trav.right);
		}else {
			System.out.println("Key Not Found ");
		}
	}
	
	public void Search(int key) {
		Search(key,root);
	}
	
	public void inOrder(Node trav) {
		if(trav==null)
			return;
		inOrder(trav.left);
		System.out.println(trav.data);
		inOrder(trav.right);
	}
	
	public void inOrder() {
		inOrder(root);
	}
	
	
}
