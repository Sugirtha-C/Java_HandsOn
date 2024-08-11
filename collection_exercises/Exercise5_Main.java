package collection_exercises;

import java.util.*;
public class Exercise5_Main {

	
	public static void main(String[] args) {
		
		Exercise5_Student student1=new Exercise5_Student(1,"Barbara");
		Exercise5_Student student2=new Exercise5_Student(2,"John");
		Exercise5_Student student3=new Exercise5_Student(3,"Doe");
		Exercise5_Student student4=new Exercise5_Student(4,"Ponds");
		Exercise5_Student student5=new Exercise5_Student(5,"Sri");
		
		List<Exercise5_Student> details=new ArrayList<>();
		details.add(student1);
		details.add(student2);
		details.add(student3);
		details.add(student4);
		details.add(student5);
		
		Exercise5_StudentManager studentManager=new Exercise5_StudentManager();
		studentManager.printStudentDetails(details);
		
		
	}
}
