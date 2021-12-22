package sampleProj.javaAssignments.assignment2;

public class TestLabour extends TestEmployee {
	private int overtime;
	public int getTotalSalary(){
		return salary+overtime;
	}
	public int getOvertime() {
		return overtime;
	}
	public void setOvertime(int overtime) {
		this.overtime = overtime;
	}

}
