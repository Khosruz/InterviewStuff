package Hash_Map;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;


public class HashMaps {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Khosru");
		hm.put(2, "zaman");
		hm.put(3, "Mohammed");
		hm.put(3, "Mohammed");
		hm.put(4, "Anser");
		hm.put(null,null );
		hm.put(5 ,null );
		hm.put(null,"Mizan" );
		hm.put(6, "afna");
		
		Enumeration e5 =(Enumeration) hm.entrySet();
		System.out.print("Enumeration : "+e5);
		System.out.println("Null value and key : "+hm);
		System.out.println(hm.get(1));
		System.out.println(hm.get(6));
		
		System.out.println(hm);
		hm.replace(5, " ", "BC");
		System.out.println(hm);
		hm.replace(3, "ViewTola");
		System.out.println(hm);
		for(Entry fe : hm.entrySet()) {
			System.out.println("Valuu of Each Number : "+ fe.getKey()+ " "+fe.getValue());
			System.out.println();
		}
		
		HashMap<Integer, Emps> emp = new HashMap<Integer, Emps>();
		Emps em1 = new Emps("Miraj", 34, "Dev");
		Emps em2 = new Emps("Afnan", 24, "QA");
		Emps em3 = new Emps("Naser", 30, "PM");
		Emps em4 = new Emps("Ahmed", 40, "BA");
		emp.put(1, em1);
		emp.put(2, em2);
		emp.put(3, em3);
		emp.put(4, em4);
		
		for(Entry<Integer, Emps> employee : emp.entrySet()) {
			int key = employee.getKey();
			Emps e = employee.getValue();
			System.out.println(key);
			System.out.print(e.name + " " +e.age +" "+e.dept);
			}
	}
}

/*	ArrayList<String> alist = new ArrayList<String>();
		alist.add("khosru");
		alist.add(" ");
		alist.add("zaman");
		alist.add("salama");
		alist.add("khanom");
		System.out.println(alist);
		alist.remove(2);
		System.out.println(alist);

		LinkedList<String> lList = new LinkedList<String>();
		lList.add("khosru");
		lList.add(" ");
		lList.add("zaman");
		lList.add("salama");
		lList.add("khanom");
		System.out.println(lList);
		lList.remove("zaman");
		System.out.println(lList);*/