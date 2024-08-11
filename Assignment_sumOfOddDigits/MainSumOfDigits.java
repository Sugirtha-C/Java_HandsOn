package natwest.java_basics;

import java.util.*;
public class MainSumOfDigits {
	
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a positive integer");
		int input = sc.nextInt();
		
		int oddDigitsSum=0;
		
			
		oddDigitsSum = UserMainCode.checkSum(input);
		
		if(oddDigitsSum == 1)
			System.out.println("Sum of the odd digits is odd");
		else
			System.out.println("Sum of the odd digits is even");
				
		}
		

}
