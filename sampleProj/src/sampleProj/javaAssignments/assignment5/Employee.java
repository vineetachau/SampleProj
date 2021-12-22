package sampleProj.javaAssignments.assignment5;

public class Employee {
	private long id;
	private String name;
	private double salary;
	private String department;
	
	public Employee(int empId, String empName, double empSal, String empDep) {
		this.id = empId;
		this.name = empName;
		this.salary = empSal;
		this.department = empDep;
	}
	
	public Employee() {
		
	}

	public void displayDetails(Employee e) {
		System.out.println("EmployeeId: "+ e.getId()+" EmployeeName: "+e.getName()+
				" EmployeeDep: "+e.getDepartment()+" EmployeeSalary: "+e.getSalary());
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
