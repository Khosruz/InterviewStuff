package com.NewComparable;


public class Students implements Comparable<Students> {

	private String studentName;
	private String studentClass;
	private Integer gread;
	private Integer gpa;

	public Students(String studentName, String studentClass, Integer gread, Integer gpa) {
		this.studentName = studentName;
		this.studentClass=studentClass;
		this.gread = gread;
		this.gpa = gpa;

	}
public String getStudentClass() {
	return studentClass;
}
	public String getStudentName() {
		return studentName;
	}

	public Integer getGread() {
		return gread;
	}

	public Integer getGPA() {
		return gpa;
	}

	public String toString() {

		return "[ Name : " + studentName +", Class :  "+studentClass+
				", Grade : " + gread + ", GPA : " + gpa + " ]";
	}
	@Override
	public int compareTo(Students o) {
		// TODO Auto-generated method stub
		return this.getStudentName().compareTo(o.studentClass);
	}

	

	

}
