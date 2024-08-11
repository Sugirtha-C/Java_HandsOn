package natwest.abstraction;
/*
 * 4.Create AbstractDemo.java class with Main method which invokes the setColor method 
and the calculateArea() method on Circle and Square Object
 */

import java.util.*;

public class AbstractDemo {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);		
		Shape c= new Circle();
		Shape s=new Square();
		
		//Setting color and calculating area of a circle
		System.out.println("\n Enter the color for your circle:");
		String color= sc.nextLine();
		c.setColor(color);
		double circleArea = c.calculateArea();
		System.out.println( "\n The area of the circle for the given radius is:" + circleArea + "\n");
		
		//Setting color and calculating area of a square
		System.out.println("\n Enter the color for your Square:");
		String squareColor= sc.nextLine();
		s.setColor(squareColor);
		double squareArea = s.calculateArea();
		System.out.println( "\n The area of the circle for the given radius is:" + squareArea + "\n");		
		

	}

}
