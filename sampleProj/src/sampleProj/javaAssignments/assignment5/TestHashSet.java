package sampleProj.javaAssignments.assignment5;

import java.util.HashSet;
import java.util.Scanner;

import sampleProj.javaAssignments.assignment4.IllegalBankTransactionException;
import sampleProj.javaAssignments.assignment4.InsufficientBalanceException;

public class TestHashSet {

	public static void main(String arg[]) {  
		HashSet<Employee> set  = new HashSet<Employee>();
		long id;
		String name,department;
		double salary;
		Employee emp = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employeeid: ");  
		id = sc.nextLong();
		emp.setId(id);
		System.out.println("Enter EmployeeName: ");  
		name = sc.next();
		emp.setName(name);
		System.out.println("Enter EmployeeDepartment: ");  
		department = sc.next();
		emp.setDepartment(department);
		System.out.println("Enter Salary: ");  
		salary = sc.nextDouble();
		emp.setSalary(salary);
		set.add(emp);
		emp.displayDetails(emp);
	} 
}
