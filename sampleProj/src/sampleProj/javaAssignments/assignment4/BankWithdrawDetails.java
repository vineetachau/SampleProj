package sampleProj.javaAssignments.assignment4;

import java.util.Scanner;

public class BankWithdrawDetails {
    private static double balance; 
	public static void deposit() {  
		Scanner sc = new Scanner(System.in);
        double amt;  
        System.out.println("Enter the amount you want to deposit: ");  
        amt = sc.nextLong();  
        balance = balance + amt;  
    }  
    public static void withdrawal() throws InsufficientBalanceException, IllegalBankTransactionException {  
    	Scanner sc = new Scanner(System.in);
        double amt;  
        System.out.println("Enter the amount you want to withdraw: ");  
        amt = sc.nextLong();
        if(amt<0)
        	throw new IllegalBankTransactionException("Transaction failed...!! Wrong Amount Entered.");
        if (balance >= amt) {  
            balance = balance - amt;  
            System.out.println("Balance after withdrawal: " + balance);  
        } else {  
            throw new InsufficientBalanceException("Transaction failed...!! Insufficient Balance");
        }  
    }  
    
    public static void main(String arg[]) throws InsufficientBalanceException, IllegalBankTransactionException {  
    	deposit();
    	withdrawal();
    }  
}
