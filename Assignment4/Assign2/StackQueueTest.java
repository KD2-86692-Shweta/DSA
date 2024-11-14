package Assignment4;

public class StackQueueTest {

	public static void main(String[] args) {
		StackQueue sq=new StackQueue();
		StackQueue qu=new StackQueue();
		
		System.out.println("----------------------Stack-------------------------");
		System.out.println("Push Elements");
		sq.push(10);
		sq.push(20);
		sq.push(30);
		sq.push(40);
		sq.push(50);
		sq.push(60);
		sq.display();
		System.out.println("after pop");
		sq.pop();
		sq.pop();
		sq.display();
		System.out.println("Peek");
		sq.peek();
		
		System.out.println("Display Elements");
	     sq.display();
	     
			System.out.println("----------------Queue-------------------------");
			System.out.println("Push Elements");

		qu.pushQueue(90);
		qu.pushQueue(80);
		qu.pushQueue(70);
		qu.pushQueue(60);
		
		qu.displayQueue();
		System.out.println("after pop");
		qu.popQueue();
		
		qu.displayQueue();
		System.out.println("Peek");
		qu.queuepeek();
		
		System.out.println("Display Elements");
		qu.displayQueue();
		
		System.out.println("Push");
		qu.pushQueue(50);
		qu.displayQueue();

	}

}
