package basics.basics;

public class MainRobo {

	public static void main(String args[]) {
		
		Robo r=new Robo();
		
		r.cleanRooms(5);
		r.makeSandwich("ham");
		r.cleanRooms(2);
		r.makeSandwich("turkey");
		r.waterPlants(4);		
				
		/*
		
		Ask Robo the battery level and print the answer.
		*/
		int numberOfRoomsCleaned=r.getRoomsCleaned();
		System.out.println("Number of rooms cleaned is:"+numberOfRoomsCleaned);
		
		int numberOfSandwichesMade=r.getSandwichesMade();
		System.out.println("Number of sandwiches made:"+numberOfSandwichesMade);
		
		int numberOfPlantsWatered=r.getPlantsWatered();
		System.out.println("Number of plants watered: "+numberOfPlantsWatered);
		
		r.rechargeBattery();
		
		r.cleanRooms(3);
		
	}
}
