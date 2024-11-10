package Assignment3;

import java.util.Scanner;

public class Assign2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CircularQueue q=new CircularQueue(4);
		
		int choice;
		int counter=0;
		do {
			System.out.println("0. Exit \n 1. Push \n 2. Pop \n 3. Peek \n 4.Display");
			System.out.println("Enter choice : ");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				counter++;
				
				
				
					
					System.out.println(counter);
				 
					if(counter==5) {
						counter--;
						System.out.println("Queue is full");
					}
					else if(counter<=4){
						System.out.println("Enter element : ");
						int ele=sc.nextInt();
				       q.push(ele);
				       System.out.println(counter);
					}
				
				
				break;
			case 2:
				
				counter--;
				
				System.out.println(counter);
				if(counter <= 0) {
					System.out.println("queue is empty");
				}
				else {
				q.pop();
				}
				break;
			case 3:
				if(counter == -1) {
					System.out.println("queue is empty");
				}else {
				q.peek();
				}
				break;
			case 4:
				

				q.display();
				break;
			
			default:
				System.out.println("Enter valid choice ");
			}	
			
		}while(choice !=0);
		
		

	}

}
