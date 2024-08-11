package vms;

public class VehicleManager {
	
	public void manageVehicle(Vehicle vehicle) {
		vehicle.startVehicle(vehicle.getVehicleType());
		
	}
	
	public static void main(String args[]) {
		
		VehicleManager manager=new VehicleManager();
		
		Vehicle vehicle1=new Car("Car",123,"Honda");
		Vehicle vehicle2=new Bike("Bike",456,"suzuki");
		Vehicle vehicle3=new Bus("Bus",789,"Pvt.Bus");
		Vehicle vehicle4=new Truck("Truck",958,"Goods");
		
		
		manager.manageVehicle(vehicle1);
		manager.manageVehicle(vehicle2);
		manager.manageVehicle(vehicle3);
		manager.manageVehicle(vehicle4);
		
	}

}
