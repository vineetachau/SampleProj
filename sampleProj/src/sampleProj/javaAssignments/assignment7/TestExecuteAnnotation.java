package sampleProj.javaAssignments.assignment7;

import java.lang.reflect.Method;

public class TestExecuteAnnotation {
	public static void main(String[] args) throws Exception {
		ExecuteAnnotation ma=new ExecuteAnnotation();  
		Method m=ma.getClass().getMethod("sayHello");  

		Execute t=m.getAnnotation(Execute.class);  
		System.out.println("value is: "+t.sequence());
	}
}
