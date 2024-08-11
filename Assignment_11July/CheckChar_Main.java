package natwest.java_basics;

import java.util.*;
public class CheckChar_Main {

	public static void main(String args[])
	{
		String name;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string");
		name=sc.nextLine();
		
		int validInput=checkChar_UserMainCode.checkCharacters(name);
		
		if (validInput == 1)			
			System.out.println("The string is valid");
		else
			System.out.println("the string is invalid");
		
		
	}
	
}
