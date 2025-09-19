
class Shape {
	
	void draw(double radius) {
		System.out.println("Drawing circle with radius: " + radius);
	}
	void draw(int length, int breadth) {
		System.out.println("Drawing rectangle with l: " + length + " and b: " + breadth);
	}
	void draw(int side) {
		System.out.println("Drawing square with side: " + side);
	}
}
class Figures {
	public static void main(String[] args) {
		Shape s = new Shape();
		s.draw(4.5);
		s.draw(4, 5);
		s.draw(9);
	}
}