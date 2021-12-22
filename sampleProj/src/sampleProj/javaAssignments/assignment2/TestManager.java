package sampleProj.javaAssignments.assignment2;

public class TestManager extends TestEmployee {
	private int incentive; 
	public int getTotalSalary(){
		return salary+incentive;
	}

	public int getIncentive() {
		return incentive;
	}
	public void setIncentive(int incentive) {
		this.incentive = incentive;
	}
}
