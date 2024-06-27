package HandsOnJava;

public class Student {
	private int studentId;
	private String studentName , studentAddress;
	private String collegeName;
	
	
	
	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public String getCollegeName() {
		return collegeName;
	}

	
	public Student(int studId,String studName,String studAddress) {
		this.studentId = studId;
		this.studentName = studName;
		this.studentAddress = studAddress;
		this.collegeName = "NIT";
//		System.out.println("Student id:"+s.getStudentName());
//		System.out.println("Student name:"+s.getStudentName());
//		System.out.println("Address:"+s.getStudentAddress());
//		System.out.println("College name:"+s.getCollegeName());
	}
	
	public Student(int studId,String studName,String studAddress,String clgName) {
		this.studentId = studId;
		this.studentName = studName;
		this.studentAddress = studAddress;
		this.collegeName = clgName;
		
	}
	
	Student s;
	
}
