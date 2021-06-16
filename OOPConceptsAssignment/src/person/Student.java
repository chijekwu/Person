package person;

public class Student extends Person {

	private double subject1;
	private double subject2;
	private double subject3;
	private String major;
	private double averageScore;
	private int studentId;
	
	public Student(int studentId, String name, char gender, int age, double subject1, double subject2, double subject3, String major) {
		super(name, gender,age);
		//super.createAddress(addr.streetName, addr.houseNumber, addr.zipcode, addr.city, addr.state);
		this.studentId = studentId;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.major = major;
	}
	public double getAverageScore() {
		return averageScore;
	}
	public void setAverageScore() {
		this.averageScore = (this.subject1 + this.subject2 + this.subject3)/3;
	}
	public String getMajor() {
		return major;
	}
	public int getStudentId() {
		return studentId;
	}

	public void display() {
		System.out.printf("%d ", this.studentId);
		super.display();
		System.out.printf("Major : %s", this.major);
		System.out.printf("Average Score: %3f", this.averageScore);
	}
}
