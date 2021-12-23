package sampleProj.javaAssignments.assignment7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)  
@interface Execute{  
	int sequence();  
}  
public class ExecuteAnnotation {
	@Execute(sequence=1)  
	public void sayHello(){
		System.out.println("hello annotation");
	} 
}
