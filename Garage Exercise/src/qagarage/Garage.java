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
	
	public Vehicle getVehicle(int index) {
		return FixGarage.get(index);
	}
	
	public ArrayList<Vehicle> getAll() {
		return FixGarage;
	}
	
	public boolean removeVehicle(int index) {
		FixGarage.remove(index);
		return true;
		
	}
	
	public String clearQueue() {
		FixGarage.clear();
		return "Queue emptied";
	}
	

}
