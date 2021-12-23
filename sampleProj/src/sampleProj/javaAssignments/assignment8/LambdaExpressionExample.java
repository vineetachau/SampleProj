package sampleProj.javaAssignments.assignment8;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionExample {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();  
		list.add("ankit");  
		list.add("mayank");  
		list.add("Rahul");  
		list.add("jai");  

		list.forEach(  
				(n)->System.out.println(n)  
				); 
	}

}
