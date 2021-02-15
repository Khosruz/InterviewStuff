package com.Comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PersonDetails extends Persons{

	public PersonDetails(Integer id, String name, Double salary) {
		super(id, name, salary);
	}
	
	public static void main(String[] args) {
		List<PersonDetails> persons = new ArrayList<>();
		System.out.println("Before Sorting\n");
		persons.add(new PersonDetails(123, "Khosru", 3215.963));
		persons.add(new PersonDetails(456, " Zaman", 9875.969));
		persons.add(new PersonDetails(789, " Miraj", 6548.364));
		persons.add(new PersonDetails(321, "  Irm", 4587.852));
		persons.add(new PersonDetails(654, " Imran", 2154.147));
		persons.add(new PersonDetails(987, " Afnan", 9632.325));
		persons.add(new PersonDetails(741, " Anser", 3219.125));
		persons.add(new PersonDetails(852, " Ahmed", 9851.985));
		for(PersonDetails person2 : persons) {
			System.out.println(person2); // Print method 1
		}
 
		System.out.println();
		//We can sort the list elements of Comparable type by Collections.sort(List) method.
		Collections.sort(persons);  // ====
		System.out.println("After Sorting\n");
		persons.forEach(System.err::println); // Print method 2
	
		
		
		
		
	}

}

/*
 * 	for(PersonDetails person2 : persons) {
			System.out.println(person2); // Print method 1
		}*/
 