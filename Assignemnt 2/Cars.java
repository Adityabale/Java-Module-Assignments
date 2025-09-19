/*
class Car{
	private String model;
	private int year;
	private double price;
	Car(String model, int year, double price){
		this.model = model;
		this.year = year;
		this.price = price;
	}
	public void setModelName(String newModelName) {
		this.model = newModelName;
	}
	public void setModelYear(int year) {
		if (year < 0) {
			System.out.println("No negative value for year.");
		}else {
			this.year = year;
		}
	}
	public void setModeltPrice(double newModelPrice) {
		this.price = newModelPrice;
	}
	public String getModelName() {
		return this.model;
	}
	public int getModelYear() {
		return this.year;
	}
	public double getModelPrice() {
		return this.price;
	}
}
public class Cars{
	public static void main(String[] args) {
		Car c = new Car("Mustang", 1994, 90088930);
		c.setModelName("Audi");
		c.setModelYear(-2000);
		c.setModelYear(2000);
		c.setModeltPrice(7882399.90);
		System.out.println("Model Name: " + c.getModelName() + " year: " + c.getModelYear() + " price: " + c.getModelPrice());
	}
}
*/
