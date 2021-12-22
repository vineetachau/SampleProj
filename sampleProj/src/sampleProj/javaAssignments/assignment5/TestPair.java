package sampleProj.javaAssignments.assignment5;

import java.util.Date;

public class TestPair {

	public static void main(String arg[]) {
		Pair p1 = new Pair("key", "Assignment");
		Pair p2 = new Pair("key", new Date());
		System.out.println(p1.getValue()+"__"+p2.getValue());
	}
}
