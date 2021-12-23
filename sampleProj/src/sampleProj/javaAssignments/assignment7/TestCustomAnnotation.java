package sampleProj.javaAssignments.assignment7;

import java.lang.reflect.Method;

public class TestCustomAnnotation {

	public static void main(String[] args) throws Exception {
		MyAnnotation ma=new MyAnnotation();  
		Method m=ma.getClass().getMethod("sayHello");  

		Test t=m.getAnnotation(Test.class);  
		System.out.println("value is: "+t.value());
	}

}
