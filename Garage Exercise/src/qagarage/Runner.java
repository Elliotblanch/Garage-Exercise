package qagarage;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car carl = new Car(true, "Magenta", 4, "BMW Z3", false);
		Motorbike mikey = new Motorbike(true, "Black", true, false, 2);
		Boat balthazar = new Boat(true, "Green", 3, "Posh Boat", 12320);
		Garage newGarage = new Garage();
		
		System.out.println(newGarage.addVehicle(mikey));
		System.out.println(newGarage.addVehicle(balthazar));
		System.out.println(newGarage.addVehicle(carl));
		System.out.println(newGarage.fixVehicle(0));
		System.out.println(newGarage.fixVehicle(1));
		System.out.println(newGarage.fixVehicle(2));
		System.out.println(newGarage.clearQueue());
		
		

	}

}