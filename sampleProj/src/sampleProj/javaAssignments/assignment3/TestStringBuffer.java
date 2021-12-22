package sampleProj.javaAssignments.assignment3;

public class TestStringBuffer {
	public static void main(String args[]){  
		StringBuffer buffer = new StringBuffer();
		buffer.append("String Buffer ").append("is a peer class of String ")
		.append("that provides much of ").append("the functionality of strings");
		System.out.println(buffer.toString());  
	} 

}
