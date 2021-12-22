package sampleProj.javaAssignments.assignment2;

public class TestSingleton {
	private static TestSingleton s = null;     
    public String str;      
    private TestSingleton()   
    {   
        str = "it is an example of singleton class.";   
    }    
    public static TestSingleton getInstance()   
    {    
        if (s== null)   
        s = new TestSingleton();   
        return s;   
    }   

}
