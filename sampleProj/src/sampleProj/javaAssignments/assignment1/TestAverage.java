package sampleProj.javaAssignments.assignment1;

import java.util.Scanner;

public class TestAverage {

	static int totalSub=0;
	static int avgSub=0;
	static int totalA=0,totalB=0,totalC=0;
	static int avgA=0,avgB=0,avgC=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		for (int i = 1; i <= 3; i++) {
			System.out.println("Enter All 3 subjects marks for "+i+" student");
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			calculateMarks(a,b,c);
		}
		System.out.println("total marks of students "+totalSub);
		avgSub = totalSub/9;
		System.out.println("total average marks of students "+avgSub);
		System.out.println("total marks of subject A "+totalA);
		System.out.println("total marks of subject B "+totalB);
		System.out.println("total marks of subject C "+totalC);
		avgA = totalA/3;
		avgB = totalB/3;
		avgC = totalC/3;
		System.out.println("total average marks of subject A "+avgA);
		System.out.println("total average marks of subject B "+avgB);
		System.out.println("total average marks of subject C "+avgC);
	}

	private static void calculateMarks(int a, int b, int c) {
		totalSub = totalSub+a+b+c;
		totalA = totalA+a;
		totalB = totalB+b;
		totalC = totalC+c;
	}

}
