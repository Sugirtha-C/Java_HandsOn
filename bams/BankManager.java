package bams;

public class BankManager {
	
	public void monthlyOperations(BankAccount bankAccount) {
	
		//vehicle.startVehicle(vehicle.getVehicleType());
		
		double acc_number=bankAccount.getAccountNumber();
		System.out.println("The account number is:" +acc_number);
		double acc_balance=bankAccount.getBalance();
		System.out.println("The acc balance is:"+acc_balance);
		bankAccount.deposit(100.00);
		bankAccount.calculateMonthlyInterest();
		bankAccount.deductMonthlyFees();
		
	}
	
	public static void main(String args[]) {
		
		
		BankManager manager=new BankManager();
		
		SavingsAccount savingBankAccount=new SavingsAccount(1005,45000.00,4.5);
		CheckingAccount checkingBankAccount=new CheckingAccount(1952,5200.00,1.5,10.0);
		
		for (int month=1;month <=12 ; month++) {
		System.out.println("=======================================");
		System.out.println("Monthly operations on savings account");
		System.out.println("=======================================");
		System.out.println("Month:"+month);
		System.out.println("==============");
		manager.monthlyOperations(savingBankAccount);
		
		System.out.println("=======================================");
		System.out.println("Monthly operations on checking account");
		System.out.println("=======================================");
		System.out.println("Month:"+month);
		System.out.println("==============");
		manager.monthlyOperations(checkingBankAccount);
		
		}
		
			
			
			
			
		}
					
		
	}


