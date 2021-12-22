package sampleProj.javaAssignments.assignment1;

import java.util.Scanner;

public class TestSubjectsAndMarks {

	public static void main(String[] args) 
	{
		int sub1,sub2,sub3,result=0;
		Scanner sc=new Scanner (System. in);
		System.out.println("Enter the Subject1 marks:");
		sub1=sc.nextInt();
		System.out.println("Enter the Subject2 marks:");
		sub2=sc.nextInt();
		System.out.println("Enter the Subject3 marks:");
		sub3=sc.nextInt();
		if(sub1>=60) {
			result++;
		}
		if(sub2>=60) {
			result++;
		}
		if(sub3>=60) {
			result++;
		}
		if(result==3) {
			System.out.println("Passed");
		}else if(result==2) {
			System.out.println("Promoted");
		}else {
			System.out.println("Failed");
		}
	}


}
