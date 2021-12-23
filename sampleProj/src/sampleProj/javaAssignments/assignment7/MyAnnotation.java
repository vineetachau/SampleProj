package sampleProj.javaAssignments.assignment7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)  
@interface Test{  
	int value();  
}  
public class MyAnnotation {

	@Test(value=10)  
	public void sayHello(){
		System.out.println("hello annotation");
	}  
}
