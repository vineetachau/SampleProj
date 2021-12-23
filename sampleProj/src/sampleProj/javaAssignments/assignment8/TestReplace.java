package sampleProj.javaAssignments.assignment8;

import java.util.Arrays;
import java.util.List;

public class TestReplace {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("justin", "nancy", "cooc", "amy", "david");
		list.replaceAll(s -> s.toUpperCase());
		System.out.println(list);
	}

}
