package collection_exercises;

import java.util.*;
public class Exercise4_HashMap {

	public static Map studentData() {
	Map<Integer,String> studentDetails=new HashMap();
	
	int studentCount=5;
	Scanner rollNum=new Scanner(System.in);
	Scanner studentName=new Scanner(System.in);
	
	System.out.println("Enter the list of five country names to display:");
	
	for(int i=1;i<=studentCount; i++) {
		
		System.out.println("Enter roll number for student #:"+i);
		int rollNumber=rollNum.nextInt();
		
		System.out.println("Enter name of student #:"+i);
		String name=studentName.nextLine();
		
		studentDetails.put(rollNumber,name);
		
	}	
	
	return studentDetails;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("enter student details in order for display");
		Map<Integer,String> studentDetails=studentData();
		System.out.println("Data as follows: \n "+ studentDetails);
		
		
		
	}
}
