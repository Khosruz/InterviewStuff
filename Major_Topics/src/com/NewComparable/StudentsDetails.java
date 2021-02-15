package com.NewComparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentsDetails extends Students {


	
	public StudentsDetails(String studentName,String studentClass, Integer gread, Integer gpa) {
		super(studentName, studentClass,gread, gpa);
	}

	public static void main(String[] args) {
		List<Students> student = new ArrayList<Students>();
		student.add(new Students("EJynal",  "DC",    6, 5));
		student.add(new Students("AFymal",  "AB"  ,  8, 1));
		student.add(new Students("CKamal",  "AF",   10, 3));
		student.add(new Students("DJamal",  "DB",   2, 4));
		student.add(new Students("BTomal",  "XA",    1, 2));
		System.out.println("Before Sorting===========");
		student.forEach(System.out::println);
		System.out.println("\nBefore Sorting===========");
		Collections.sort(student);
		student.forEach(System.out::println);
		
	}

}
