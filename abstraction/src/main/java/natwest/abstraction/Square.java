package natwest.abstraction;
/*
 * 3.Create another sub class Square.java which extends Shape and
a.Implements the calculateArea() method. 
It should calculate the area as length*breadth and print the area in the console. 
Consider Length/Breadth = 4.0.
 */
public class Square extends Shape{

	float length= 4.0f;
	float breadth = 4.0f;
	float area;
	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return area= length * breadth;
	}
	

}
