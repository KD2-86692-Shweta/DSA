package Assign3;

public class Employee {
	int empid;
	String name;
	
	Employee(){
		
	}

	
	public Employee(int empid) {
		super();
		this.empid = empid;
	}

	

	public Employee(String name) {
		super();
		this.name = name;
	}


	public Employee(int empid, String name) {
		super();
		this.empid = empid;
		this.name = name;
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


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + "]";
	}
	
	
	
	

}
