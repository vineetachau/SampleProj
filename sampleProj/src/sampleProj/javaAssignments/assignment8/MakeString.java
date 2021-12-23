package sampleProj.javaAssignments.assignment8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class MakeString {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Arrays.asList("1234","wsxw","qaz","qwertyui","q","qwe","qwerty","qwqw").forEach(s -> sb.append(s.charAt(0)).append(""));
	    System.out.println(sb.toString().trim());
	    
	    String str = "heloo how are you";
	    String initials = Arrays.stream(str.split(" "))
	    		.map(s -> s.substring(0, 1))
	    		.collect(Collectors.joining());
	    System.out.println(initials);
	    
	    Consumer<List<String> >
        dispList = list -> list.stream().forEach(a -> System.out.print(a.charAt(0) + ""));
        List<String> list = Arrays.asList("1234","wsxw","qaz","qwertyui","q","qwe","qwerty","qwqw");
        dispList.accept(list);

	}

}
