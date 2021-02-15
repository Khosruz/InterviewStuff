package com.Comparabel_Comparator;
//Comparable and comparator are from interface
//Comparable belongs to java.lang package
//Comparator belongs to java.util package
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Claients extends Employee {
	public Claients(Integer id, String name, Double salary) {
		super(id, name, salary);
	}

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		System.out.println("Before Sorting List ::::::: ");
		employeeList.add(new Employee(123, "khosru", 548979.32));
		employeeList.add(new Employee(456, "Miraj", 56579.00));
		employeeList.add(new Employee(789, "Imam", 7845.99));
		employeeList.add(new Employee(321, "Anser", 78945.07));
		employeeList.add(new Employee(654, "Ahmed", 55445.21));
		employeeList.add(new Employee(987, "Mohima", 65664.32));
		employeeList.add(new Employee(369, "Afnan", 545454.91));
		employeeList.forEach(System.out::println);

		System.out.println("========================================\n");
		
		System.out.println("Sorting Based On Employee ID::::::: ");
		Collections.sort(employeeList);
		employeeList.forEach(System.out::println);
		System.out.println("========================================\n");
		
		
		List<Person> personList = new ArrayList<>();
		System.out.println("Before Sorting List ::::::: ");
		personList.add(new Person(123, "khosru"));
		personList.add(new Person(456, "Miraj"));
		personList.add(new Person(789, "Imam"));
		personList.add(new Person(321, "Anser"));
		personList.add(new Person(654, "Ahmed"));
		personList.add(new Person(987, "Mohima"));
		personList.add(new Person(369, "Afnan"));
		personList.forEach(System.out::println);
		
		personList.forEach(System.out::println);
	}
	
}
//https://www.youtube.com/watch?v=2NzcE27sdGA