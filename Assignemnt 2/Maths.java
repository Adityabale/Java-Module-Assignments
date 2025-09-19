
class MathOperations {
	
	int add(int a, int b) {
		return a + b;
	}
	
	double add(double a, double b) {
		return a + b;
	}
	
	int add(int a, int b, int c) {
		return a + b + c;
	}
}
class Maths{
	public static void main(String[] args) {
		MathOperations m = new MathOperations();
		System.out.println(m.add(1,  4));
		System.out.println(m.add(4.5, 8.9));
		System.out.println(m.add(4,  5, 6));
	}
}