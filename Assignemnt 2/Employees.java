class Employee{
	String name;
	int salary;
	Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	int employeeSalary() {
		return this.salary;
	}
}

class Manager extends Employee{
	int bonus;
	Manager(String name, int salary, int bonus) {
		super(name, salary);
		this.bonus = bonus;
	}
	int totalSalary() {
		return this.salary + this.bonus;
	}
}

class Employees{
	public static void main(String []args) {
		Manager m = new Manager("Amit", 20000, 2000);
		System.out.println(m.totalSalary());
	}
}