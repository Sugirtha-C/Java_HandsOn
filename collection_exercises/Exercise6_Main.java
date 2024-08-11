package collection_exercises;
import java.util.*;

public class Exercise6_Main {
	
	public static void main(String[] args) {
	
	List<Exercise6_Student> studentsList=new ArrayList<>();
	
	studentsList.add(new Exercise6_Student(1,"Jon","A"));
	studentsList.add(new Exercise6_Student(2,"Sri","B"));
	studentsList.add(new Exercise6_Student(3,"Raghav","C"));
	studentsList.add(new Exercise6_Student(4," Don","A"));
	studentsList.add(new Exercise6_Student(5," Saina","B"));
	
	Collections.sort(studentsList);//,(s1,s2) -> Integer.compare(s1.getID(),s2.getID()));
	
	System.out.println("Sorted List: \n");
	for (Exercise6_Student student:studentsList) {
		System.out.println(student);
	}
	
}
}
