package natwest.inheritance;


public class SeniorCitizenAccount extends BankAccount{

	public float interestRate=10.5f;
	
	public void applyFixedDeposit(){
				
		System.out.println("\n The interest rate for Senior Citizen Account is:" + interestRate);
	}
}
