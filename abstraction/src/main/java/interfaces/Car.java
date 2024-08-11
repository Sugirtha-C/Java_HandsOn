package interfaces;

public class Car extends MotorisedVehicle implements IVehicle {

	private String direction ;
	
	public void setCarDirection(String direction)
	{
		this.direction=direction;
	}
	@Override
	public void drive() {
		System.out.println("This is printed from the car class-Drive method implemented through IVehicle");
		System.out.println("\n The car is turning " + direction);
		
	}

	@Override
	public void turnLeft() {
		System.out.println("This is printed from the car class-turnLeft method implemented through IVehicle");
		
	}

	@Override
	public void brake() {
		System.out.println("This is printed from the car class-brake method implemented through IVehicle");
	}
		
	public void checkMotor() {
		System.out.println("This is printed from 'CAR' class and the print statement is overriden successully \n");
	}
		
	}


