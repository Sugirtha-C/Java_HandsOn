package collection_exercises;

public class Exercise6_Student implements Comparable<Exercise6_Student>{
	
	private int id;
	private String name;
	private String section;
	
	
	public Exercise6_Student(int id, String name, String section) {
		this.id = id;
		this.name = name;
		this.section = section;
	}
	
	public int getID() {
		return id;
	}
	
	public String ngetNme() {
		
		return this.name;
	}
	
	public String getSection() {
		
		return this.section;
	}
	
	
	@Override
	public int compareTo(Exercise6_Student other) {
		return Integer.compare(this.id, other.id);
	}
	
	@Override
	public String toString() {
		
		return ("ID: "+id+" Name: " + name + " Section: "+section);
	}

	
}
