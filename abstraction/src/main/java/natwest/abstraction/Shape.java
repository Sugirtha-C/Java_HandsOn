package natwest.abstraction;

import java.util.Scanner;

/*
 * Let us understand more about abstract classes with the below program
1.Create a parent class Shape.java with a instance variable color and methods below,
a.Abstract method calculateArea() which returns double value;
b.Concrete method setColor which accepts a String color as the parameter and sets the instance variable ‘color’. 
It should also print the color in the console.
2.Create a sub class Circle.java which extends Shape.java and
a.Implements the calculateArea() method. It should calculate the area as 3.14*r*r and print the area in the console. 
Consider radius = 5.0.
3.Create another sub class Square.java which extends Shape and
a.Implements the calculateArea() method. It should calculate the area as length*breadth and print the area in the console. 
Consider Length/Breadth = 4.0.
4.Create AbstractDemo.java class with Main method which invokes the setColor method 
and the calculateArea() method on Circle and Square Object
 */

public abstract class Shape {

	public String color;
	
	
	abstract double calculateArea();
	
	public void setColor(String color) {
		
		this.color=color;
		System.out.println("The colour of the shape is:" + color);
	}
	
}
