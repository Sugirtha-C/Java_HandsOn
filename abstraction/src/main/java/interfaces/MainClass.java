package interfaces;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);	
		Scanner sc1=new Scanner(System.in);
		Train t=new Train();
		Car c=new Car();
		MotorisedVehicle mv= new MotorisedVehicle();
		
		System.out.println("\n Enter the count of people who deboarded the train:" );
		int peopleCount = sc.nextInt();
		
		//Calling methods from train class
		t.setPeopleCount(peopleCount);
		t.getNumberOfPeople();
		t.drive();;
		t.turnLeft();
		t.brake();
		
		//Calling methods from car class
		c.brake();
		c.turnLeft();
		
		System.out.println("\n Enter the direction of the car you wish to turn:");
		String direction= sc1.nextLine();
		c.setCarDirection(direction);
		c.drive();
		
		//Calling the method from Car's object:
		c.checkMotor();
		
		//Calling methods from MotorisedVehicle class
		mv.checkMotor();
		

	}

}
