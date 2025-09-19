/*
abstract class Shape {
	abstract double area();
}
class Circle extends Shape{
	double r;
	double PI = 3.14;
	Circle(double r) {
		this.r = r;
	}
	@Override
	double area() {
		return this.PI * this.r * this.r;
	}
}
class Rectangle extends Shape{
	double l;
	double b;
	Rectangle(double l, double b) {
		this.l = l;
		this.b = b;
	}
	@Override
	public double area() {
		return this.l * this.b;
	}
}
class Shapes{
	public static void main(String[] args) {
		Shape s1 = new Circle(5.0);
		Shape s2 = new Rectangle(6.0, 9.0);
		
		double a1 = s1.area();
		double a2 = s2.area();
		
		System.out.println("Area of circle: " + a1);
		System.out.println("Area of rectangle: " + a2);
	}
}
*/