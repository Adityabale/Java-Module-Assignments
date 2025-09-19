package Exam;

abstract class Vehicle {
	abstract void start();
}

class Car extends Vehicle {
	@Override
	public void start() {
		System.out.println("Start the car!!!");
	}
}

class Bike extends Vehicle {
	public void start() {
		System.out.println("Start the bike!!!");
	}
}

class VehicleSystem {
	public static void main(String[] args) {
		Car c = new Car();
		Bike b = new Bike();
		
		c.start();
		b.start();
	}
	
}