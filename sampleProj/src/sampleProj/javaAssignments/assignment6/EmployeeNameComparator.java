package sampleProj.javaAssignments.assignment6;

import java.util.Comparator;

import sampleProj.javaAssignments.assignment5.Employee;

public class EmployeeNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
