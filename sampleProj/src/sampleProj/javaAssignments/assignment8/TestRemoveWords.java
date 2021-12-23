package sampleProj.javaAssignments.assignment8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TestRemoveWords {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>
		(Arrays.asList("1234","wsxw","qaz","qwertyui","q","qwe","qwerty","qwqw"));
		set.removeIf(p -> p.length() %2 == 1);
		System.out.println(set);
	}

}
