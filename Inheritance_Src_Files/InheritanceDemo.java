package natwest.inheritance;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NRIAccount nri=new NRIAccount();
		SeniorCitizenAccount sca=new SeniorCitizenAccount();
		
		System.out.println("Enter the following details for NRI Account operations:\n");
		nri.depositMoney();
		nri.withdrawMoney();
		nri.applyFixedDeposit();
		
		System.out.println("\n Enter the following details for Senior Citizen Account operations:\n");
		sca.depositMoney();
		sca.withdrawMoney();
		sca.applyFixedDeposit();
}

}
