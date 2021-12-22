package sampleProj.javaAssignments.assignment2;

public class TestSavingAccount extends TestBankAccount {
	private double cashCredits;

	public double getbalance() {
		return balance+cashCredits;
	}

	public double getCashCredits() {
		return cashCredits;
	}

	public void setCashCredits(double cashCredits) {
		this.cashCredits = cashCredits;
	}

}
