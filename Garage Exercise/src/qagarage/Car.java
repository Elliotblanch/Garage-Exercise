package qagarage;

public class Car extends Vehicle{
	
	private int doors;
	private String model;
	private boolean electric;
	
	public Car(boolean engine, String colour, int doors, String model, boolean electric) {
		super(engine, colour);
		this.doors = doors;
		this.model = model;
		this.electric = electric;
	}
	@Override
	public float fixVehicle() {
		float cost = 650f;
		if (doors > 2) {
			cost += 400f;
		} else {
			cost += 200f;
		}
		if (electric == true) {
			cost += 1000f;
		}	
		if (model == "BMW Z3") {
			cost += 400f;
		}
		return cost;
	}
		
		
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public boolean isElectric() {
		return electric;
	}
	public void setElectric(boolean electric) {
		this.electric = electric;
	}
	@Override
	public String toString() {
		return "Car [doors=" + doors + ", model=" + model + ", electric=" + electric + "]";
	}
	

}
