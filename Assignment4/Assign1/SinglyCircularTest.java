package Assignment4;
// Implement singly circular linked list using tail pointer (no head pointer). Compare time complexities of
//all operations.
public class SinglyCircularTest {

	public static void main(String[] args) {
		SingluCircular sc=new SingluCircular() ;
		sc.addFirst(12);
		sc.addFirst(13);
		sc.addlast(14);
		sc.addlast(15);
		sc.addlast(16);
		sc.addlast(17);
		sc.display();
		System.out.println("add at pos");
		sc.addAtPos(30, 3);
		sc.display();
		System.out.println("delete first and last");

     	sc.deleteFirst();
		sc.deleteLast();
		sc.display();
		System.out.println("deletet");
		sc.deleteAtPos(3);
		//sc.addAtPos(30, 3);
		sc.display();

	

}
}
