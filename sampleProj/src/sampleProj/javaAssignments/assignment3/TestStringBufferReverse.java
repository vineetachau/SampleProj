package sampleProj.javaAssignments.assignment3;

public class TestStringBufferReverse {
	public static void main(String args[]){  
		String str = "This method returns the reversed object on which it was called";
		StringBuffer buffer = new StringBuffer(str);
		System.out.println(buffer.reverse());
	} 

}
