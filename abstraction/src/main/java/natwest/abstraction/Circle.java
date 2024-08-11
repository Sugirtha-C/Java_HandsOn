package natwest.abstraction;

/*
 * 2.Create a sub class Circle.java which extends Shape.java and
a.Implements the calculateArea() method. It should calculate the area as 3.14*r*r and print the area in the console. 
Consider radius = 5.0.
 */

public class Circle extends Shape{

	 float pi= 3.14f;
	 float radius= 5.0f;
			
	@Override
	double calculateArea() {
		// 
		float area = pi * radius * radius;
		return area;
	}

}
