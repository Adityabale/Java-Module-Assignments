
class Calculator {
	
	int multiply(int a, int b) {
		return a * b;
	}
	double multiply(double a, double b) {
		return a * b;
	}
	double multiply(int a, double b) {
		return a * b;
	}
}
class Calculators{
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.multiply(4,  8));
		System.out.println(c.multiply(4.5, 9.5));
		System.out.println(c.multiply(4,  4.5));
	}
}