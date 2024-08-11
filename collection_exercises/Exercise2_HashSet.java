package collection_exercises;

import java.util.*;

public class Exercise2_HashSet {
	
	
	public static Set getCountryNames() {
		
		
		int countryCount=5;
		
		Set countries=new HashSet();
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=1;i<=countryCount; i++) {
			System.out.println("Enter Country #:"+i);
			countries.add(sc.nextLine());
		}				
		
		return countries;
		
	}
	
	public static Set values1To10(){
		
		Scanner sc=new Scanner(System.in);
		
		int value_size=10;
		
		Set value_list=new HashSet();
		
		System.out.println("Enter the list of 10 values display:");
		
		for(int i=1;i<=value_size; i++) {
			System.out.println("Enter value #:"+i);
			value_list.add(sc.nextInt());
		}
		
		
		return value_list;
	}
	
	public static Set secondSetValues(){
		
		Scanner sc=new Scanner(System.in);
		
		Set value_list=values1To10();
		
		for(int i=11;i<=15;i++) {
			System.out.println("Enter value #:"+i);
			value_list.add(sc.nextInt());
			
		}
		return value_list;	
		
		}
	
	public static void main(String[] args) {
		
		Scanner inputChoice=new Scanner(System.in);
		
		System.out.println("Enter 1 to generate 5 country names. \n Enter 2 to generate 10 numbers.\n Enter 3 to generate 15 numbers");
		
		int choice=inputChoice.nextInt();
		
		if(choice == 1) {
		
		
		Set countryList=getCountryNames();
		
		System.out.println(countryList);
		
		}
		
		else if(choice == 2) {
		
		Set valuesList=values1To10();	
		
		System.out.println(valuesList);
		
		}
		else if(choice == 3) {
		
		Set secondList=secondSetValues();	
		
		System.out.println(secondList);
		}
		
		else {
			
			System.out.println("Invalid input.Enter a number between 1 to 3 only");
			
		}

	}
}
