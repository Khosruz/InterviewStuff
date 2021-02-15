package com.Comparabel_Comparator;

import java.util.Comparator;

public class Person implements Comparator<Employee>{
	private Integer id;
	private String name;

	public Person(Integer id, String name) {
		this.name = name;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return "Person [ID = "+id+", Name = "+name+ "]";
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return this.getId().compareTo(getId());
	}
}
