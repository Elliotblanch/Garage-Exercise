package qagarage;

import java.util.ArrayList;

public class Garage {
	
	public ArrayList<Vehicle> FixGarage = new ArrayList<>();
	
	public String addVehicle(Vehicle newVehicle) {
		FixGarage.add(newVehicle);
		return newVehicle + " added to queue";
	}
	
	public String fixVehicle(int index) {
		return "Total cost: " + FixGarage.get(index).fixVehicle();
		
	}
	
	public String clearQueue() {
		FixGarage.clear();
		return "Queue emptied";
	}
	

}
