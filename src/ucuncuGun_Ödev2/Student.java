package ucuncuGun_�dev2;

public class Student extends User {
	private int studentNumber;
	private String homework;
	
	public Student() {
		
	}

	public Student(int studentNumber, String homework) {
		super();
		this.studentNumber = studentNumber;
		this.homework = homework;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String get�dev() {
		return homework;
	}

	public void set�dev(String homework) {
		this.homework = homework;
	}

	
}
