package sampleProj.javaAssignments.assignment4;

import java.util.Scanner;

public class TestUnsupportedOperationException {
	public static void main(String args[]){  
		double val1, val2, result;
		Scanner sc=new Scanner (System. in);
		System.out.println("Enter the first value:");
		val1=sc.nextDouble();
		System. out. println("Enter the second value:");
		val2=sc.nextDouble();
		if(val2==0)
			throw new UnsupportedOperationException("can not divide by 0");
		result = val1/val2;
		System.out.println(result); 
	}  

}
