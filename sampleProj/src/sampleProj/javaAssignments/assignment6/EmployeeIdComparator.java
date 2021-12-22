package sampleProj.javaAssignments.assignment6;

import java.util.Comparator;

import sampleProj.javaAssignments.assignment5.Employee;

public class EmployeeIdComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return (int) (o1.getId()-o2.getId());
	}

}
