package Assignment2;

import java.util.Scanner;

public class Assign3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Size of Queue");
		int size=sc.nextInt();
		
		LinearQueue q=new LinearQueue(size+1);
		
		int choice;
		do {
			System.out.println("0.Exit \n 1.Push \n 2.Pop \n 3.Peek 4.Display");
			System.out.println("Enter choice :  ");
			
			choice=sc.nextInt();
			
			switch(choice) {
			
			case 1:
				if(q.isFull()){
					System.out.println("Queue is Full");
				}
				else {
					System.out.println("Enter value ");
					int ele=sc.nextInt();
					q.push(ele);
				}
				break;
			case 2:
				if(q.isEmpty()) {
					System.out.println("Queue is Empty ");
					
				}
				else {
					q.pop();
				}
				break;
				
			case 3:
				if(q.isEmpty()) {
					System.out.println("Queue is Empty ");
					
				}
				else {
					System.out.println(q.peek()); 
				}
				break;
				
			case 4:
				q.display();
				
			default:
				System.out.println("Enter valid choice ");
			
				
			
				
				
			}
			
		}while(choice!=0);
	}

}
