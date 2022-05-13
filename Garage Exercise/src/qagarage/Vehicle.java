package qagarage;

public abstract class Vehicle {
	private boolean engine;
	private String colour;
	
	
	public boolean isEngine() {
		return engine;
	}


	public void setEngine(boolean engine) {
		this.engine = engine;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public Vehicle(boolean engine, String colour) {
		super();
		this.engine = engine;
		this.colour = colour;
	}


	public abstract float fixVehicle();
		


}