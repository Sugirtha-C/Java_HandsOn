package firstmavendemo;

import java.util.Scanner;

/*
 * Exercise 3: Combined Circle Area and Temperature Conversion
 * Write a Java program that includes methods to calculate the 
 * area of a circle and convert a temperature from Fahrenheit to 
 * Celsius.
 * The program should prompt the user to enter a radius and 
 * a Fahrenheit temperature, then display the results using the methods.	
 * 
 * */
 
public class ThirdExercise {

	public double areaCalc(int radius)
	{
		double areaOfCircle= Math.PI * radius * radius ;
		return areaOfCircle;
	}
	
	public float tempCalc(float fahrenheit)
	{
		float Celsius= (float) ((fahrenheit - 32) * (5.0/9.0));
		return Celsius;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radius;
		float fahrenheit;
		Scanner sc= new Scanner (System.in);
		Scanner sc1= new Scanner (System.in);
		ThirdExercise te= new ThirdExercise();
		
		//calculating the radius
		
		System.out.println("Enter the circle's radius to calculate the area:");
		radius=sc.nextInt();		
		double area=te.areaCalc(radius);		
		System.out.println("The area of the circle is:"+ area + "\n");
		
		// calculating temperature conversion		
		
		System.out.println("Please enter the Fahrenheit value:");;
		fahrenheit= sc1.nextFloat();
		float Celsius= te.tempCalc(fahrenheit);
		System.out.println("The temperature in Celsius is:" + Celsius);
		
	}

}
