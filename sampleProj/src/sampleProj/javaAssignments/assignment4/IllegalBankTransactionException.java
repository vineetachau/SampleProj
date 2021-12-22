package sampleProj.javaAssignments.assignment4;

public class IllegalBankTransactionException extends Exception {
	public IllegalBankTransactionException(String errorMsg) {
		super(errorMsg);
	}
}
