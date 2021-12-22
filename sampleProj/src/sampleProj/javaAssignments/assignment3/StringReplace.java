package sampleProj.javaAssignments.assignment3;

public class StringReplace {
	public static void main(String args[]){  
		String s1="Java String pool refers to collection of strings which are stored in heap memory ";
		System.out.println(s1);
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		String s2= s1.replace("a", "$");
		System.out.println(s2);
		String s3="Java String pool refers to Collection of strings which are stored in heap memory ";
		System.out.println(s1.matches(s3));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));  
	}  

}
