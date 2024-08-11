package natwest.inheritance;

public class NRIAccount extends BankAccount {
	
public float interestRate=6.5f;
	
	public void applyFixedDeposit(){
				
		System.out.println("\n The interest rate for NRI Account is:" + interestRate);
	}
}
