
class Laptop {
	private String brand;
	private double price;
	Laptop(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
	void setBrandName(String newBrandName) {
		this.brand = newBrandName;
	}
	void setBrandPrice(double newBrandPrice) {
		if (price < 0) {
			System.out.println("No negative price allowed.");
		}else {
			this.price = newBrandPrice;
		}
	}
	String getBrandName() {
		return this.brand;
	}
	double getBrandPrice() {
		return this.price;
	}
}
class Laptops{
	public static void main(String[] args) {
		Laptop l = new Laptop("Acer", 30500);
		l.setBrandName("DELL");
		l.setBrandPrice(45000);
		System.out.println("Brand: " + l.getBrandName() + " price: " + l.getBrandPrice());
	}
}