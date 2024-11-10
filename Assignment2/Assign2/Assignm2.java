package Assignment3;

public class Assignm2 {
	
	public static void main(String[] args) {
		//Employee e=new Employee();
		
Employee e1=new Employee();
		
		Employee arr[]=new Employee[5];
		arr[0]=new Employee(1,"harshada",90000);
		arr[1]=new Employee(2,"snehal",90000);
		arr[2]=new Employee(3,"Shweta",420000);
		arr[3]=new Employee(4,"Pinky",24000);
		arr[4]=new Employee(5,"mrunal",10000);
		
		
		System.out.println("Employees List");
		for(Employee e:arr)
		{
		System.out.println(e.toString());
		}
		System.out.println();
		e1.sortbySal(arr, arr.length);
		
		System.out.println("Employees after Sorting by Salary");
		for(Employee e:arr)
		{
		System.out.println(e.toString());
		}
		
		
	}
	
	
}