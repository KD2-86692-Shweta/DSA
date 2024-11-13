package Assignment5;

public class BST {

	static class Node{
		private int data;
		private Node left;
		private Node right;
		
		public Node(int value){
			data=value;
			left=right=null;
			
		}
		
	}
	private Node root;
	public BST(){
		  root=null; 
	}
	
	public void addNode(int value,Node trav) {
		
		Node newnode=new Node(value);
		if(root==null)
		{
		    root=newnode;
		}
		else {
			Node travs=root;
			if(value<travs.data) {
				if(trav.left==null)
				{
				trav.left=newnode;
				return;
				}
				else
				{
					addNode(value,trav.left);
				}
			
			}else 
			{
				if(trav.right==null) {
					trav.right=newnode;
					return;
				}
				else {
					addNode(value,trav.right);
					
					
				}
			}
			
		}
		
    
	    
	}
	public void add(int value) {
		addNode(value,root);
	}
	
	public void display(Node trav) {
		
		if(trav==null)
			return;
			display(trav.left);
			System.out.println(trav.data);

			display(trav.right);
		
	}
	
	public void dis() {
		display(root);
	}
	
	
}
