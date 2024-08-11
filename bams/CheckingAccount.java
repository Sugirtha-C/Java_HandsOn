package bams;

public class CheckingAccount implements BankAccount{

	int accountNumber;
	double balance;
	double transactionFee;
	double monthlyFee;
	
	public CheckingAccount(int accountNumber,double balance,double transactionFee,double monthlyFee) {
		this.accountNumber=accountNumber;
		this.balance=balance;
		this.transactionFee=transactionFee;
		this.monthlyFee=monthlyFee;
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
		
		if(amount >=0) {
		balance+=amount;
		System.out.println("The updated balance in checking account number "+accountNumber + "after the deposit is: " +balance);
		}
		else
			System.out.println("Amount should be greater than zero");
		
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		

		if (amount >0 && balance >=(amount+transactionFee))
		{
			balance-=(amount+transactionFee);		
			System.out.println("The updated balance in checking account number "+accountNumber + "with transactional fee applied after the withdrawal is: " +balance);
		}
		else
			System.out.println("Insufficient funds or invalid amount");
		
	}

	@Override
	public void calculateMonthlyInterest() {
		// TODO Auto-generated method stub
		System.out.println("Monthly interest will not be deducted for savings account");
	}

	@Override
	public void deductMonthlyFees() {
		// TODO Auto-generated method stub
		
		if(balance>=monthlyFee) {
			balance-=monthlyFee;		
			System.out.println("Balance remaining in checking account number: "+accountNumber+ " after applying monthly fee is" + balance);
		}
		else
			System.out.println("Insufficient funds to process monthly deduction");
	}

}
