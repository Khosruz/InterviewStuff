package com.Map_Table;
/***
 * Hash map is not synchronized
 * single null key and multiple null values are allowed
 * Thread not safe
 * using entrySet() to fetch data
 */
import java.util.HashMap;
import java.util.Set;

public class HashMaps {
	public static void main(String[] args) {
		HashMap hp = new HashMap();
		hp.put(null,  "A");
		hp.put(2, null);
		hp.put(3, null);
		hp.put(null,"M");
		hp.put(null,"I");
		hp.put(6, null);
		hp.put(10,  null);
		hp.put(11,  "O");
		hp.put(31,  "T");
		hp.put(32,  "V");
		hp.put(51,  "I");
		hp.put(67,  "X");
		
		System.out.println("length of map is : "+hp.size());
		//System.out.println("Original value is : " +hp);
		Set s = hp.entrySet();
		System.out.print("Using Entry Set :"+ s);
		
		
		System.out.println("\n");
		//Clone new map
		HashMap hm = new HashMap();
		hm =(HashMap)hp.clone();
		System.out.println("From Hp: "+ hp);
		System.out.println("From Hm: "+ hm);
		System.out.println("");
		//Delete Original Values
		hp.clear();
		System.out.println("After Deleting Hp: "+ hp);
		System.out.println("After Deleting From Hm: "+ hm);
		
		
		//Replace value
		hm.replace(1, "X");
		System.err.println("After Replacing From Hm: "+ hm);
		
		
		
	
	}
	
	
}
