package com.Map_Table;
/**
 * Hashtable Synchronized,
 * Thread is safe
 * null Key or Value doesnt allowed
 * to get data using " elements() of Enumeration and 
 * entrySet() of Set Interface,
 *  
 *  
 *  */
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTables {
	public static void main(String[] args) {
		Hashtable hm1 = new Hashtable();
		hm1.put(1, "K");
		hm1.put(81, "K");
		hm1.put(2, "H");
		hm1.put(3, "O");
		hm1.put(4, "S");
		hm1.put(5, "R");
		hm1.put(6, "U");
		hm1.put(9, "Wahid");
		hm1.put(11, "K");
		hm1.put(12, "H");
		hm1.put(13, "O");
		System.out.println("Genuin Values " +hm1);
		
		
		
		Hashtable hm2 = new Hashtable();
		hm2 = (Hashtable) hm1.clone();
		System.out.println("Value of Hm1 : " + hm1);
		System.out.println("Value of Hm2 : " + hm2);
		hm1.clear();
		System.out.println("Value of Hm1 : " + hm1);
		System.out.println("Value of Hm2 : " + hm2);
		
		Hashtable ht = new Hashtable();
		ht.put(1, "Khosruz");
		ht.put(2, "Miraj");
		ht.put(3, "Imam");
		if(ht.contains("Khosruz")) {
			System.out.println("\nThe Value is present : "+ht.get(1));
			System.out.println("Available Values : " +ht);
		}
		//To get data: method (1) using "Enumeration-->elements();"
		Enumeration e = ht.elements();
		System.out.print("\nValues by Enumerations : ");
		while(e.hasMoreElements()) {
			System.out.print(" " +e.nextElement());
		}
		//System.out.println();
		//To get data: method (2) By using --entrySet() --set
		Set s = ht.entrySet();
		System.out.print("\nGet Values using Entry Set: "+s);
		
		
		
	}
	
}
