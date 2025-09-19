
class Vehicle {
	void run() {
		System.out.println("Accelerate the vehicle");
	}
}
class Bike extends Vehicle {
	@Override
	void run() {
		System.out.println("Accelerate the bike");
	}
}
class Car extends Vehicle {
	@Override
	void run() {
		System.out.println("Accelerate the car");
	}
}
class Autos {
	public static void main(String[] args) {
		Vehicle v1 = new Bike();
		Vehicle v2 = new Car();
		v1.run();
		v2.run();
	}
}