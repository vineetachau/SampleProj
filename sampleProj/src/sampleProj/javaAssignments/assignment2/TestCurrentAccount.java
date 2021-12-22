package sampleProj.javaAssignments.assignment2;

public class TestCurrentAccount extends TestBankAccount {
	private double fixedDeposits;

	public double getbalance() {
		return balance+fixedDeposits;
	}

	public double getFixedDeposits() {
		return fixedDeposits;
	}

	public void setFixedDeposits(double fixedDeposits) {
		this.fixedDeposits = fixedDeposits;
	}

}
