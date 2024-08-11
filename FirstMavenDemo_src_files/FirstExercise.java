package firstmavendemo;

import java.util.*;

// This program calculates the area of a circle

public class FirstExercise {

	 
	private static final int pi = 0;

	public static void main(String[] args) {
		int radius;
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the circle's radius to calculate the area:");
		radius=sc.nextInt();
		double area= Math.PI * radius * radius ;
		System.out.println("The area of the circle is:"+ area);
		
	}

}
