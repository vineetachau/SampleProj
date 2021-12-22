package sampleProj.javaAssignments.assignment3;

public class TestStringBuilder {
	public static void main(String args[]){  
		StringBuilder builder = new StringBuilder();
		builder.append("String Builder ").append("is a peer class of String ")
		.append("that provides much of ").append("the functionality of strings");
		System.out.println(builder.toString());  
	}  

}
