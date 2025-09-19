class Student{
	private String name;
	private int marks;
	Student(String name, int marks){
		this.name = name;
		this.marks = marks;
	}
	void setName(String newName) {
		this.name = newName;
	}
	void setMarks(int newMarks) {
		this.marks = newMarks;
	}
	String getName() {
		return this.name;
	}
	int getMarks() {
		return this.marks;
	}
}
class Students{
	public static void main(String[] args) {
		Student s = new Student("Rahul", 52);
		s.setName("Ram");
		s.setMarks(45);
		System.out.println("Name: " + s.getName() + " balance: " + s.getMarks());
	}
}
