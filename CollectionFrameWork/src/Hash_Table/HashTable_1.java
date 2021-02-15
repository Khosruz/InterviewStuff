package Hash_Table;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

// Hashtable store value on the basis of hashcode of the key
// Hashtable is same like HashMap 
// Hashtable is synchronized
// Stroe element as key -- and -- Value pair
// Null value doesnt allowed
// Only uniqe key is allowed--
// Using Enumeration and EntrySet() to fatch data
// Generic can be applied

public class HashTable_1 {
	public static void main(String[] args) {

		Hashtable ht = new Hashtable();
		ht.put("A", "SDLC");
		ht.put("B", "SQL");
		ht.put("C", "Selenium");
		ht.put("D", "JAVA");
		ht.put("E", "Maven");
		ht.put("F", "Maven"); // Similer Multiple values are allowed 
//		ht.put("F", "MAVAN"); But only Unique key is allowed 
//		ht.put("G",  null); //Null Key Or Value not allowed
		System.out.println(ht);
		//ht.replace("E", "UFT");
		System.out.println(ht);
		//Create a clone copy/shallow copy
		Hashtable ht1 = new Hashtable();
		ht1 = (Hashtable)ht.clone();
		System.out.println("Before Clearing : ");
		System.out.println("Original Copy : "+ht);
		System.out.println("Clone Copy : "+ht1); 
		
		// clear ht table data
		ht.clear();
		System.out.println("After Clearing : ");
		System.out.println("Original Copy : "+ht);
		System.out.println("Clone Copy : "+ht1); 
		
		Hashtable ht2 = new Hashtable();
		ht2.put("A", "SDLC");
		ht2.put("B", "SQL");
		ht2.put("C", "Selenium");
		ht2.put("D", "JAVA");
		ht2.put("E", "Maven");
		ht2.put("F", "Maven");
		System.out.println(ht2.get("F"));
		System.out.println("From new ht2 table : "+ht2 );
		if(ht2.containsValue("Selenium")) {
			System.out.println("Table is exist");
		}else {
			System.out.println("Table doesnt exist");
		}
		
		//print date by Enumeration and EntrySet();
		Enumeration en = ht2.elements();
		System.out.print("By using Enumaration to printing : ");
		while(en.hasMoreElements()) {
			System.out.print(en.nextElement()+", ");
		}
		Set sets = ht2.entrySet();
		System.out.print("\nBy using Entry Set : "+sets);
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	 
	}
}
