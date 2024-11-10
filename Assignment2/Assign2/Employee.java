package Assignment3;

public class Employee {
	int empid;
	String name;
	double Salary;
	
	Employee(){
		
	}

	
	public Employee(double salary) {
		super();
		Salary = salary;
	}


	public Employee(int empid) {
		super();
		this.empid = empid;
	}

	

	public Employee(String name) {
		super();
		this.name = name;
	}



	public Employee(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		Salary = salary;
	}


	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return Salary;
	}


	public void setSalary(double salary) {
		Salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", Salary=" + Salary + "]";
	}
	
	public void sortbySal(Employee employee[],int length) {
		
		for(int i=0; i<length; i++)
		{
			Employee temp=employee[i];
			int j;
			for(j=i-1; j>=0&& employee[j].Salary<temp.Salary; j--)
			{
				employee[j+1]=employee[j];
				//System.out.println("heyy"+j);
			}
			employee[j+1]=temp;
			
		}
		
	}
	
	
	

}
