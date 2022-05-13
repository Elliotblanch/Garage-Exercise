package qagarage;

public class Motorbike extends Vehicle {
	
	private boolean radio;
	private boolean sideCar;
	private int wheels;
	
	public Motorbike(boolean engine, String colour, boolean radio, boolean sideCar, int wheels) {
		super(engine, colour);
		this.radio = radio;
		this.sideCar = sideCar;
		this.wheels = wheels;
	}
	
	
	@Override
	public float fixVehicle() {
		float cost = 475f;
		if (radio == true) {
			cost += 235;
		}
		if (sideCar == true) {
			cost += 545;
		}
		if (wheels > 2) {
			cost += 250;
		}
		return cost;
	}
	public boolean isRadio() {
		return radio;
	}
	public void setRadio(boolean radio) {
		this.radio = radio;
	}
	public boolean isSideCar() {
		return sideCar;
	}
	public void setSideCar(boolean sideCar) {
		this.sideCar = sideCar;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}


	@Override
	public String toString() {
		return "Motorbike [radio=" + radio + ", sideCar=" + sideCar + ", wheels=" + wheels + "]";
	}
	
	

}
