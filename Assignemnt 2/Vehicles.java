/*
class Vehicle {
    String brand;
    String speed;
    Vehicle(String brand, String speed){
        this.brand = brand;
        this.speed = speed;
    }
}
class Car extends Vehicle{
    String fuelType;
    public Car(String brand, String speed, String fuelType){
        super(brand, speed);
        this.fuelType = fuelType;
    }
    public String displayCarDetails(){
        return "Brand: " + this.brand + ", speed: " + this.speed + ", fuel type: " + this.fuelType;
    }
}
class Vehicles{
    public static void main(String[] args){
        Car c = new Car("Mustang", "200", "Diesel");
        System.out.println(c.displayCarDetails());
    }
}
*/