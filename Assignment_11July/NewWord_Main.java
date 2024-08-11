package natwest.java_basics;

import java.util.*;
public class NewWord_Main {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string to trim");
		String input=sc.nextLine();
		
		System.out.println("Enter the length to trim from both ends");
		int n=sc.nextInt();
		String trimmedOutput=NewWord_UserMainCode.formNewWord(input,n);
		
		System.out.println(trimmedOutput);
	}

}
