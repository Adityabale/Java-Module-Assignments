class Printer {
	
	void print(String name) {
		System.out.println("The String value entered: " + name);
	}
	void print(int num) {
		System.out.println("The int value enetered: " + num);
	}
	void print(double value) {
		System.out.println("The double value entered: " + value);
	}
}
class Printers {
	public static void main(String []args) {
		Printer p = new Printer();
		p.print("Aditya");
		p.print(1);
		p.print(4.5);
	}
}