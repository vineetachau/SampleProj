package sampleProj.javaAssignments.assignment2;

public class TestBankDetails {
	public static void main(String[] args) {
		TestCurrentAccount c = new TestCurrentAccount();
		TestSavingAccount s = new TestSavingAccount();
		System.out.println(c.getbalance());
		System.out.println(s.getbalance());
	}

}
