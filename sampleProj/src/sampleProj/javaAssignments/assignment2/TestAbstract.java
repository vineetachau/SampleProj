package sampleProj.javaAssignments.assignment2;

public class TestAbstract {
	public void disp2()
	{
		System.out.println("overriding abstract method");
	}
	public static void main(String args[]){
		TestAbstract obj = new TestAbstract();
		obj.disp2();
		AbstractExample m = new AbstractExample() {

			@Override
			public void disp2() {
				// TODO Auto-generated method stub
				
			}};
		m.disp();
	}
}
