package firstmavendemo;

import java.util.Scanner;

// Convert temperature from Fahrenheit to Celsius

public class SecondExercise {

	public static void main(String[] args) {
		
		float fahrenheit;
		Scanner sc= new Scanner (System.in);
		System.out.println("Please enter the Fahrenheit value:");;
		fahrenheit= sc.nextFloat();
		float Celsius= (float) ((fahrenheit - 32) * (5.0/9.0));
		System.out.println("The temperature in Celsius is:" + Celsius);
		
		//C = (°F - 32) × 5/9

	}

}

/*
 * float fahrenheit;
		Scanner sc= new Scanner (System.in);
		System.out.println("Please enter the Fahrenheit value:");;
		fahrenheit= sc.nextFloat();
		
		float Celsius= ((fahrenheit - 32) * (5/9));
		System.out.println("The temperature in Celsius is:" + Celsius);
 * */
