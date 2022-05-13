package qagarage;

public class Boat extends Vehicle{
	
	private int sails;
	private String model;
	private int distanceTravelled;
	
	public Boat(boolean engine, String colour, int sails, String model, int distanceTravelled) {
		super(engine, colour);
		this.sails = sails;
		this.model = model;
		this.distanceTravelled = distanceTravelled;
	}
	@Override
	public float fixVehicle() {
		float cost = 1350f;
		if (sails == 1) {
			cost += 240f;
		} else if (sails == 2){
				cost += 420f;
		} else if (sails > 2) {
			cost += 600f;
			}
		if (distanceTravelled > 10000) {
			cost += 1650;
		} else if (distanceTravelled > 5000) {
			cost += 900;
		}
		if (model == "Cool Boat") {
			cost += 1500f;
		} else if (model == "Cheap Boat") {
			cost += 500f;
		} else if (model == "Posh Boat") {
			cost += 5500f;
		} else { 
			cost += 1200;
		}
			
		return cost;
	}
	
	
	public int getSails() {
		return sails;
	}
	public void setSails(int sails) {
		this.sails = sails;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getDistanceTravelled() {
		return distanceTravelled;
	}
	public void setDistanceTravelled(int distanceTravelled) {
		this.distanceTravelled = distanceTravelled;
	}
	@Override
	public String toString() {
		return "Boat [sails=" + sails + ", model=" + model + ", distanceTravelled=" + distanceTravelled + "]";
	}


}
