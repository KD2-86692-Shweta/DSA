package Assignment5;

public class BinarySearchTreeTest {

	public static void main(String[] args) {
		
		BinarySearchTree bst=new BinarySearchTree();
		bst.addData1(12);
		bst.addData1(34);
		bst.addData1(89);
		bst.addData1(67);
		bst.inOrder();
		
		bst.Search(89);
		

	}

}
