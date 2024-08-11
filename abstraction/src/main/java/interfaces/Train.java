package interfaces;

public class Train implements IVehicle,IPublicTransport{

	private int peopleCount;
	
	public void setPeopleCount(int peopleCount)
	{
		this.peopleCount=peopleCount;
	}
	
	@Override
	public void getNumberOfPeople() {
		
		System.out.println("\n The number of people who got off from the train is:" + peopleCount + "\n");
		
	}

	@Override
	public void drive() {
		System.out.println("This is printed from train class and implemented from IVehicle interface \n");
		
	}

	@Override
	public void turnLeft() {
		System.out.println("This is the turnLeft method from train class and implemented from IVehicle interface \n ");
		
	}

	@Override
	public void brake() {
		
		System.out.println("This is the brake method from train class and implemented from IVehicle interface \n");		
		
	}

}
