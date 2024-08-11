package basics.basics;

public class Robo {
	
	int roomsCleaned;
	int sandwichesMade;
	int plantsWatered;
	int batteryLevel=100;
	
	void cleanRooms(int numberOfRooms){
		
		roomsCleaned+=numberOfRooms;
		batteryLevel-=numberOfRooms*5;
		System.out.println("Rooms cleaned by robo is:" +roomsCleaned + "\n Remaining battery level is: "+batteryLevel +"\n");		
	}
	
	void makeSandwich(String typeOfSandwich) {
		
		sandwichesMade+=1;
		batteryLevel-=10;
		System.out.println("Type of sandwich made:"+typeOfSandwich + "\n Remaining battery level:" + batteryLevel +"\n");
				
	}
	
	void waterPlants(int numberOfPlants) {
		
		plantsWatered+=numberOfPlants;
		batteryLevel-=numberOfPlants*3;
		System.out.println("Number of plants watered by the robot is:" +plantsWatered + "\n Remaining battery level is:" +batteryLevel+"\n");
	}
	
	int getRoomsCleaned(){
		
		return roomsCleaned;
	}
	
	int getSandwichesMade() {
		
		return sandwichesMade;
		
	}
		
	int getPlantsWatered() {
		return plantsWatered;
	}
	
	void rechargeBattery() {
		batteryLevel=100;
		System.out.println("\n The Robo is recharged back to 100%"+"\n");
		
	}
}

