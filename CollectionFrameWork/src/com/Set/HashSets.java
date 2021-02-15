package com.Set;

import java.util.HashSet;
import java.util.TreeSet;

/*
 * Sr. No.	Key	Hash Set	Tree Set
1
	Implementation 
	Hash set is implemented using HashTable 
	The tree set is implemented using a tree structure. 
2
	Null Object 
	HashSet allows a null object 
	The tree set does not allow the null object. It throws the null pointer exception. 
3
	Methods 
	Hash set use equals method to compare two objects 
	Tree set use compare method for comparing two objects. 
4
	Heterogeneous object 
	Hash set doesn't now allow a heterogeneous object 
	Tree set allows a heterogeneous object 
5
	Ordering 
	HashSet does not maintain any order 
	TreeSet maintains an object in sorted order 
 */
public class HashSets {

	public static void main(String[] args) {
		HashSet<String> hSet = new HashSet<String>();
		hSet.add("X");
		hSet.add(null);
		hSet.add("S");
		hSet.add("7");
		hSet.add("5");
		hSet.add("1");
		hSet.add("7");
		hSet.add("*");
		hSet.add("-87");
		hSet.add("-0.90");
		hSet.add("$");
		hSet.add("AXZ");
		System.out.println("Hash Set is : "+hSet);
		
	}
	
}
