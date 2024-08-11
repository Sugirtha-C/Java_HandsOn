package bams;

public interface BankAccount {
	
	double getAccountNumber();
	double getBalance();
	void deposit(double amount);
	void withdraw(double amount);
	void calculateMonthlyInterest();
	void deductMonthlyFees();

}
