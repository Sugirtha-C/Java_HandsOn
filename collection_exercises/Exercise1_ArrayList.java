package collection_exercises;

import java.util.*;
public class Exercise1_ArrayList {
	
	public static List countryNames() {
		
		int countryCount=5;
		Scanner sc=new Scanner(System.in);
		
		List list=new ArrayList();
	
		System.out.println("Enter the list of five country names to display:");
		
		for(int i=1;i<=countryCount; i++) {
			System.out.println("Enter Country #:"+i);
			list.add(sc.nextLine());
		}
		
		return list;
	}
   
	public static List values(){
	
		Scanner sc=new Scanner(System.in);
		
		int value_size=10;
		
		List value_list=new ArrayList();
		
		System.out.println("Enter the list of 10 values display:");
		
		for(int i=1;i<=value_size; i++) {
			System.out.println("Enter value #:"+i);
			value_list.add(sc.nextInt());
		}
		
		
		return value_list;
	}
	
	public static List secondSetValues(){
		
		Scanner sc=new Scanner(System.in);
		
		List value_list=values();
		
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
			
			
			List countryList=countryNames();
			
			System.out.println(countryList);
			
			}
			
			else if(choice == 2) {
			
			List valuesList=values();	
			
			System.out.println(valuesList);
			
			}
			else if(choice == 3) {
			
			List secondList=secondSetValues();	
			
			System.out.println(secondList);
			}
			
			else {
				
				System.out.println("Enter a number between 1 to 3 only");
				
			}
		}
}
