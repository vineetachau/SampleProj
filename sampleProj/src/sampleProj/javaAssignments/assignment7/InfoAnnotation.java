package sampleProj.javaAssignments.assignment7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})  
@interface Info{  
	int authorID();  
	String author() default "";
	String supervisor() default "";
	String date(); 
	String time();
	int version();
	String description() default "";
}  
public class InfoAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
