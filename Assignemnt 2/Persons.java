/* class Person{
	String name;
	int age;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
}
class Student extends Person{
	int roll_no;
	int marks;
	Student(String name, int age, int roll_no, int marks){
		super(name, age);
		this.roll_no = roll_no;
		this.marks = marks;
	}
	String studentDetails() {
		return "Name: " + this.name + " age: " + this.age + " roll no: " + this.roll_no + " marks: " + this.marks;
	}
}
class Persons{
	public static void main(String[] args) {
		Student s = new Student("Amit", 24, 222, 70);
		System.out.println(s.studentDetails());
	}
}
*/