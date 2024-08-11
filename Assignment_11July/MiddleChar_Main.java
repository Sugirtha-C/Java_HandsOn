package natwest.java_basics;

import java.util.*;
public class MiddleChar_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the input string:");
		String input=sc.nextLine();
		
		String trimmedOutput=MiddleChar_UserMainCode.getMiddleChars(input);
		System.out.println(trimmedOutput);
	}

}
