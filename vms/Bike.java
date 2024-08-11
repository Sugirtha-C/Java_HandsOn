package vms;

public class Bike implements Vehicle{
	
	private String vehicleName;
	private int vehicleID;
	private String vehicleType;
	
	public Bike(String vehicleName,int vehicleID,String vehicleType) {
		this.vehicleName=vehicleName;
		this.vehicleID=vehicleID;
		this.vehicleType=vehicleType;
	}

	@Override
	public void startVehicle(String vehicle) {
		// TODO Auto-generated method stub
		
		System.out.println("Start the: " + vehicleName +"of type: "+ vehicleType +" with vehicle ID:" + vehicleID+ "\n");
		
	}

	@Override
	public int getVehicleID() {
		// TODO Auto-generated method stub
		return vehicleID;
	}

	@Override
	public String getVehicleType() {
		// TODO Auto-generated method stub
		return vehicleType;
	}

}
