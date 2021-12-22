package sampleProj.javaAssignments.assignment6;

import java.util.HashSet;
import java.util.Scanner;

public class AvoidDuplicate {

	public static void main(String args[]){ 
		HashSet<String> set = new HashSet<String>();
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i < 11; i++) {
			String product;
			System.out.println("Enter Product "+i+": ");
			product = sc.next();
			if(set.contains(product)) {
				System.out.println("Already Exist..");
				i--;
				continue;
			}
			set.add(product);
		}
		for (String string : set) {
			System.out.println(string);
		}
	}

}
