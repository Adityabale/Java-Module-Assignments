/* Create a class Student with:
● int studentId, String name, double grade.
● A constructor to initialize these fields.
● Methods:
○ updateGrade(double newGrade): Updates the grade, but should not accept
negative values (handle using exception handling).
○ display(): Prints student details. */

class Student
{
	int studentId;
	String name;
	double grade;
	Student(int studentId, String name, double grade)
	{
		this.studentId=studentId;
		this.name=name;
		this.grade=grade;
	}
	void updateGrade(double grade)
	{
		try
		{
			if(grade<0)
			{
				throw new IllegalArgumentException("Grade cannot be negative");
			}
			this.grade=grade;
			System.out.println("Grade updated successfully");
			
		}
		catch(IllegalArgumentException il)
		{
			System.out.println("Error: "+il.getMessage());
		}
	}
	void display()
	{
		System.out.println("Student Details");
		System.out.println("Name: "+name+" ID:"+studentId+" Grade:"+grade);
	}
}
public class StudentException10 {
	public static void main(String args[])
	{
		Student std=new Student(1,"Akshay", 89);
		std.display();
		
		std.updateGrade(-98);
		std.display();
		
//		std.updateGrade(98);
//		std.display();
		
		
	}

}
