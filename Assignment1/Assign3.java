package Assign3;

import java.util.Scanner;

//Create array of employees and search employee by empid name



public class Assign3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee e[]=new Employee[6];
	    e[0]=new Employee(1,"Shweta");
	    e[1]=new Employee(2,"Snehal");
	    e[3]=new Employee(3,"Harshada");
	    e[4]=new Employee(4,"Shivali");
	    e[5]=new Employee(5,"Mrunali");
	    
	    System.out.println("Enter id to search ");
	    int search=sc.nextInt();
	   
	   int index=LinearSearch(search ,e);
	   if(index== -1) {
		   System.out.println("Id not Found");
	   }else {
		   System.out.println("Id Found at location :"+index );
	   }
	    

	}

	private static int LinearSearch(int search, Employee e[]) {
		int i;
		for( i=1;i<6;i++) {
		if(search == e[i].empid) {
			System.out.println("id found : "+i);
		}
		
		}
		
		return i;
	}

}
