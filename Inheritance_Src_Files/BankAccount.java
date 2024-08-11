package natwest.inheritance;

import java.util.*;
/*
 * depositMoney – Prints the depositAmount.
 withdrawMoney – Prints the withdrawalAmount and calculates balance as mentioned below,
 balance = depositAmount – withdrawAmount
*/

/* Create a class InheritanceDemo with main method which creates instance of the NRIAccount and 
 * SeniorCitizen Account and invokes the methods depositMoney(), withdrawMoney(), applyFixedDeposit()* 
 * 
 */

public class BankAccount{
	
		
	public int withdrawAmount;
	public int depositAmount;
	public float interestRate=9.5f;
	public float balance;
	Scanner sc= new Scanner(System.in);
	
	public void depositMoney() {
		
		System.out.println("Enter the deposit amount:");
		depositAmount=sc.nextInt();
	}
	
	public void withdrawMoney() {
		
		System.out.println("\n Enter the withdrawal amount:");
		withdrawAmount=sc.nextInt();
		balance=depositAmount-withdrawAmount;
		System.out.println("\n The balance remaining in your account is:"+balance);
		}
	

	}
