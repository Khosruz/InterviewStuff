package com.List;

import java.util.ArrayList;
import java.util.List;

public class LinkedLists {
	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		 al.add("P");
	     al.add("O");
	     al.add("W");
	     al.add("L");
	     al.add("K");
	     al.add("F");
	     al.add("F");
	     System.out.println("Total Length of Array List is : "
	     +al.size());
	     System.out.println(al);
	     al.remove(2);
	     System.out.println(al);
	    
	}
}
