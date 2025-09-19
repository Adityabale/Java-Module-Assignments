
class Patient {
	final int id;
	private String name;
	private String disease;
	Patient(int id, String name, String disease) {
		this.id = id;
		this.name = name;
		this.disease = disease;
	}
	void setPatientName(String newPatientName) {
		this.name = newPatientName;
	}
	void sePatientDisease(String newPatientDisease) {
		this.disease = newPatientDisease;
	}
	String getPatientName() {
		return this.name;
	}
	String getPatientDisease() {
		return this.disease;
	}
}
class Patients{
	public static void main(String[] args) {
		Patient p = new Patient(10, "Shyam", "Diabetics");
		p.setPatientName("Rahul");
		p.sePatientDisease("Cough");
		System.out.println("id: " + p.id + " name: " + p.getPatientName() + " disease: " + p.getPatientDisease());
	}
}