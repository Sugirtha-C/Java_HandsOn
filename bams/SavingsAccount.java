package bams;

public class SavingsAccount implements BankAccount {

	int accountNumber;
	double balance;
	double interestRate;
	
	public SavingsAccount(int accountNumber,double balance,double interestRate) {
		this.accountNumber=accountNumber;
		this.balance=balance;
		this.interestRate=interestRate;
		
	}
	@Override
	public double getAccountNumber() {
		// TODO Auto-generated method stub
		
		return accountNumber;
		
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		
		return balance;
		
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		
		if(amount>=0) {
		balance+=amount;
		System.out.println("The updated balance in savings account number "+accountNumber + "after the deposit is: " +balance);
		}
		else{
			System.out.println("Deposit amount should be greater than zero");
		}
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		
		if (amount > 0 && balance >=amount) {
			balance-=amount;		
			System.out.println("The updated balance in savings account number "+accountNumber + "after the withdrawal is: " +balance);
		}
		else
			System.out.println("Invalid amount or insufficient funds.");
	}

	@Override
	public void calculateMonthlyInterest() {
		// TODO Auto-generated method stub
		
		balance+=balance *(interestRate/12);
		System.out.println("The updated balance in account number "+accountNumber + "after the monthly interest added is: " +balance);
		
	}

	@Override
	public void deductMonthlyFees() {
		// TODO Auto-generated method stub
		
		System.out.println("Monthly fee will not be deducted for savings account");
		
	}

}
