package interfaces;

/*
 * Let us all create interfaces and implementation classes:
1.Create an interface IVehicle with the below methods:
drive();
turnLeft();
brake();
2. Create another interface IPublicTransport with a method
getNumberOfPeople();
3. Create a class MotorisedVehicle.java with a method checkMotor() 
which prints the message “The motor of the vehicle is in good condition”
4. Create a class Car.java which extends the MotorisedVehicle class and 
implements the IVehicle interface. This method should print appropriate messages in the implemented methods.
(Ex. “The car is in brake mode” etc)
5. Create a class Train.java which implements both the IVehicle and IPublicTransport interfaces. 
The implemented methods should print appropriate messages (Ex. “The train is turning left” etc)
 */

public interface IVehicle {

	public void drive();
	public void turnLeft();
	public void brake();
}
