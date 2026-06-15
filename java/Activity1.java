package fst;

public class Activity1 {

	public static void main(String[] args) {
		Car C1 = new Car();
		C1.displayCharacteristics();
		C1.acceleration();
		C1.brake();

	}

}

class Car {
	
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	Car() {
		tyres = 4;
		doors = 5;
	}
	
	void displayCharacteristics() {
		System.out.println("Color = " + color);
		System.out.println("Transmission = " + transmission);
		System.out.println("Manufactured year = " + make);
		System.out.println("Tyres = " + tyres);
		System.out.println("Color = " + color);
		System.out.println("Doors = " + doors);
	}
	
	void acceleration() {
		System.out.println("Car is moving forward");
	}
	
	void brake() {
		System.out.println("Car has stopped");
	}
}