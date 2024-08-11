package collection_exercises;

public class Exercise5_Student {

	
	private int rollNumber;
	private String studentName;
	
	public Exercise5_Student(int rollNumber, String studentName) {
		
		this.rollNumber = rollNumber;
		this.studentName = studentName;
	}
	
	public int getRollNumber() {
		
		return rollNumber;
	}
	
	public String getStudentName() {
		
		return studentName;
	}
	
	@Override
	public String toString() {
		
		return "RollNumber: "+rollNumber+" Name:" + studentName;
	}
}
