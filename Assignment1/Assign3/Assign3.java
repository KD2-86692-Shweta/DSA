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
	    
	   
	    
//	    for(int i=0; i<e.length; i++)
//		{
//			System.out.println(e[i].toString() );
//		}
	   
	    
	    int choice;
	    do {
	    	
	    	System.out.println("0.Exit\n1.Search Employee by Id\n2.Search Emploee by name");
			System.out.println("Enter Your Choice");
			choice=sc.nextInt();
			switch(choice) {
			
			case 1:
				System.out.println("Enter Employee name to search");
				String name=sc.next();
				
				Employee e1=SearchByName(e,new Employee(name));
				
				break;
				  
				   
			case 2:
				System.out.println("Enter Employee id to search");
				int id=sc.nextInt();
				 Employee e2=LinearSearch(e ,new Employee(id));
				   break;
		    

			}
	    }while(choice !=0);
	  
	    

	}

	private static Employee LinearSearch(Employee[] arr, Employee employee) {
		int i;
		for( i=1;i<arr.length-1;i++) {
		if(employee.empid == arr[i].empid) {
			System.out.println("id found : "+i);
			return arr[i];
		}
		
		}
		
		System.out.println("Employee Not Found");
		return null;	}
	
	private static Employee SearchByName(Employee[] arr,Employee employee) {
		for(int i=0;i<arr.length;i++) {
			if(employee.name.equalsIgnoreCase(arr[i].name)) {
				System.out.println("Employee found at index= "+i);
				return arr[i];
			}
		}
		System.out.println("Employee not found");
		return null;
	}

}


