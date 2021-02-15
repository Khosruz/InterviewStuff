package com.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * ArrayList LinkedList 1) ArrayList internally uses a dynamic array to store
 * the elements. LinkedList internally uses a doubly linked list to store the
 * elements. 2) Manipulation with ArrayList is slow because it internally uses
 * an array. If any element is removed from the array, all the bits are shifted
 * in memory. Manipulation with LinkedList is faster than ArrayList because it
 * uses a doubly linked list, so no bit shifting is required in memory. 3) An
 * ArrayList class can act as a list only because it implements List only.
 * LinkedList class can act as a list and queue both because it implements List
 * and Deque interfaces. 4) ArrayList is better for storing and accessing data.
 * LinkedList is better for manipulating data.
 * 
 * @author khosuzzaman
 *
 */
public class Arrays_VS_Linked {
	public static void main(String[] args) {
		aList();
		lList();
	}

	public static void aList() {
		List<String> al = new ArrayList<String>();
		al.add("P");
		al.add("O");
		al.add("W");
		al.add("L");
		al.add("K");
		al.add("F");
		al.add("F");
		System.out.println("Total Length of Array List is : " + al.size());
		System.out.println(al);

	}
	public static void lList() {
		List<String> ll = new LinkedList<String>();
		ll.add("A");
		ll.add("X");
		ll.add("E");
		ll.add("Z");
		ll.add("U");
		ll.add("O");
		System.out.println("Total Length of Linked List is : " + ll.size());
		System.out.println(ll);

	}
}
