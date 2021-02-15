package com.Comparator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.jar.Attributes.Name;

public class EmployeeDetails extends Employee {

	public EmployeeDetails(String name, Integer age, Integer id, Double salary) {
		super(id, age, name, salary);
	}

	public static void main(String[] args) {
		List<EmployeeDetails> employee = new LinkedList<EmployeeDetails>();
		System.out.println("Before Sorting=========================================");
		employee.add(new EmployeeDetails(" Zaman", 25, 3214, 89574.321));
		employee.add(new EmployeeDetails(" Afnan", 56, 9787, 54781.0));
		employee.add(new EmployeeDetails(" Miraj", 39, 4789, 25645.147));
		employee.add(new EmployeeDetails(" Imam", 21, 6587, 56412.852));
		employee.add(new EmployeeDetails(" Imran", 54, 4512, 69874.369));
		employee.add(new EmployeeDetails(" Ahmed", 37, 3654, 54789.852));
		employee.add(new EmployeeDetails(" Anser", 47, 4563, 98745.147));
		employee.add(new EmployeeDetails(" Billu", 52, 7896, 77742.852));
		employee.add(new EmployeeDetails(" Boltu", 69, 1245, 87545.258));
		employee.add(new EmployeeDetails(" Zaman", 25, 3214, 89574.321));
		employee.add(new EmployeeDetails(" Sento", 85, 1234, 47425.789));
		employee.forEach(System.out::println);
		Collections.sort(employee, new EmployeeSort());

		// sort by using anonymous class
		 
		Collections.sort(employee, new Comparator<EmployeeDetails>() {

			@Override
			public int compare(EmployeeDetails ed1, EmployeeDetails ed2) {
				// TODO Auto-generated method stub
				 // return ed1.getAge().compareTo(ed2.age);
				return ed1.getName().compareTo(ed2.getName());
			}

		});
		System.out.println("\nAfter Sorting========================================");
		employee.forEach(System.out::println);

	}

}
