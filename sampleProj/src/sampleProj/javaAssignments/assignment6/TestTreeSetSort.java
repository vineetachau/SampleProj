package sampleProj.javaAssignments.assignment6;

import java.util.Scanner;
import java.util.TreeSet;

import sampleProj.javaAssignments.assignment5.Employee;

public class TestTreeSetSort {
	
	public static void main(String args[]){ 
		TreeSet<Employee> set = null;
		String input;
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter an input a or b :");
		input = sc.next();
		if(input.equalsIgnoreCase("a")) {
			set = new TreeSet<Employee>(new EmployeeIdComparator());
		}else if(input.equalsIgnoreCase("b")) {
			set = new TreeSet<Employee>(new EmployeeNameComparator());
		}else {
			System.out.println("wrong input given......");
		}
		set.add(new Employee(22345,"Java",25000,"CRM"));
		set.add(new Employee(124345,"Rahul",25000,"CRM"));
		set.add(new Employee(12345,"Amit",25000,"CRM"));
		set.add(new Employee(172345,"Ankut",25000,"CRM"));
		set.add(new Employee(32345,"Vinni",25000,"CRM"));
		set.add(new Employee(123445,"Mona",25000,"CRM"));
		set.add(new Employee(42345,"Shalu",25000,"CRM"));
		set.add(new Employee(1222345,"Janvi",25000,"CRM"));
		set.add(new Employee(92345,"Kale",25000,"CRM"));
		set.add(new Employee(1234445,"Bhawe",25000,"CRM"));
		for(Employee ele: set)
        {
            System.out.println(ele.getId()+" "+ele.getName()+" "+ele.getDepartment());
        }
	}

}
