package sampleProj.javaAssignments.assignment2;

public class TestSalary {
	public static void main(String args[]){  
        TestEmployee emp=new TestEmployee();  
        TestManager mgr=new TestManager();  
        TestLabour lbr=new TestLabour();  
        System.out.println("Employee Salary: "+emp.getTotalSalary());  
        System.out.println("Manager salary: "+mgr.getTotalSalary());  
        System.out.println("Labour salary: "+lbr.getTotalSalary());  
    }

}
