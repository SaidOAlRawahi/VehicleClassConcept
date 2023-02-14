package src;

public class Vehicle {
	String Model;
	String yearOfManufactutr;
	String numberOfWheels;
	float weight;
	
	void start() {
		System.out.println("Vehicle started.");
	}
	void stop(){
		System.out.println("Vehicle stopped.");
	}
	void drive(float numberOfMiles) {
		System.out.println("Vehicle driven " + numberOfMiles + " miles.");
	}
	void honk() {
		System.out.println("Honk Honk!");

	}
}

class Car extends Vehicle{
	int numberOfDoors;
	void openTrunk() {
		System.out.println("Trunk opened.");
	}
}

class Truck extends Vehicle{
	int numberOfAxles;
	float capacityInTons;
	
	void load (float weight){
		
		System.out.println("Loaded " + weight + " tons.");
	}
}