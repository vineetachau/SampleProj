package sampleProj.javaAssignments.assignment3;

public class TestStringBuilderReverse {
	public static void main(String args[]){  
		String str = "This method returns the reversed object on which it was called";
		StringBuilder builder = new StringBuilder(str);
		System.out.println(builder.reverse()); 
	}  

}
