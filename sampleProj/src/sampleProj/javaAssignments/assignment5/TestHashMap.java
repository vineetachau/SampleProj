package sampleProj.javaAssignments.assignment5;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class TestHashMap {
	public static void main(String arg[]) {
		HashMap<Integer, Double> map = new HashMap<Integer, Double>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			int key;
			System.out.println("Enter Key: ");
			key = sc.nextInt();
			double val;
			System.out.println("Enter Value: ");
			val = sc.nextDouble();
			map.put(key, val);
		}
		
		for (Entry<Integer, Double> entry : map.entrySet()) {
			int key = entry.getKey();
			double val = entry.getValue();
			System.out.println(key+"_"+val);
		}
	}
}
