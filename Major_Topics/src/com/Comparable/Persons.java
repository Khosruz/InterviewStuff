package com.Comparable;


// Comparable provides a single sorting sequence. In other words, we can sort the 
//collection on the basis of a single element such as id, name, and price.
//Comparable is present in java.lang package.
// Comparable affects the original class, i.e., the actual class is modified.
//Comparable provides compareTo() method to sort elements.
//We can sort the list elements of Comparable type by Collections.sort(List) method.


public class Persons implements Comparable<Persons> {
	private Integer id;
	private String name;
	private Double salary;
	
	public Persons(Integer id, String name, Double salary) {
		this.id=id;
		this.name= name;
		this.salary=salary;
	}
	
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Double getSalary() {
		return salary;
	}
	public String toString() {
		return "Person  [ ID = "+id+", Name = "+ name + ", Salary = "+ salary+" ]";
	}
	
	
	//Sorting by Name
 @Override 
 public int compareTo(Persons p1) {
	 return this.getName().compareTo(p1.name);
 }
	//Sorting by ID
 /*
 @Override
 public int compareTo(Persons p1) {
	 return this.id.compareTo(p1.getId());
 }
	
//Sorting by Salary
 @Override
 public int compareTo(Persons p1) {
	 return this.getSalary().compareTo(p1.getSalary());
			 
 }*/
}
