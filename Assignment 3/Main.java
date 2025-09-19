package Assignment3;

class Vehicle {
	 private String make;
	 private String model;
	 private int year;

	 public Vehicle(String make, String model, int year) {
	     this.make = make;
	     this.model = model;
	     this.year = year;
	 }

	 // Getters and Setters
	 public String getMake() {
		 return make; 
		 }
	 
	 public void setMake(String make) {
		 this.make = make; 
		 }
	
	 public String getModel() {
		 return model; 
		 }
	 
	 public void setModel(String model) {
		 this.model = model; 
		 }
	
	 public int getYear() {
		 return year; 
		 }
	 
	 public void setYear(int year) {
		 this.year = (year > 0) ? year : 2000; 
		 }
	
	 public void displayInfo() {
	     System.out.println(year + " " + make + " " + model);
	 }
}

class Car extends Vehicle {
	private int numberOfDoors;

	 public Car(String make, String model, int year, int numberOfDoors) {
	     super(make, model, year);
	     this.numberOfDoors = numberOfDoors;
	 }

	 public Car(String make, String model) {
	     this(make, model, 2025, 4);
	 }

	 public int getNumberOfDoors() { 
		 return numberOfDoors; 
		 }
	 public void setNumberOfDoors(int numberOfDoors) {
	     this.numberOfDoors = numberOfDoors;
	 }

	 @Override
	 public void displayInfo() {
	     System.out.println(getYear() + " " + getMake() + " " + getModel() + " | Doors: " + numberOfDoors);
	 }
}

public class Main {
	 public static void main(String[] args) {
	     Car car1 = new Car("Toyota", "Camry", 2022, 4);
	     car1.displayInfo();

	     Car car2 = new Car("Honda", "Civic");
	     car2.displayInfo();

	     Car car3 = new Car("", "", -5, -2);
	     car3.displayInfo();
	 }
}
