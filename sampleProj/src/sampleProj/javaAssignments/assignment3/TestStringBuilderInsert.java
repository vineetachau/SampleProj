package sampleProj.javaAssignments.assignment3;

public class TestStringBuilderInsert {
	public static void main(String args[]){  
		String str = "it is used to _ at the specified index position";
		String newSub = "insert text";
		int index = str.indexOf("_");
		System.out.println("Initial String = " + str);
		System.out.println("Index where new string will be inserted = " + index);
		StringBuilder resString = new StringBuilder(str);
		resString.insert(index + 1, newSub);
		System.out.println("Resultant String = "+resString.toString());  
	}  

}
