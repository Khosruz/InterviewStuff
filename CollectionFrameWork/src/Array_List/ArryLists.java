package Array_List;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArryLists {
	public static void main(String[] args) {
		String[] staticArray = {"Khosru", "Salama", "Khanom"};
		System.out.print("Static Array : ");		
		for (String string : staticArray) {
			System.out.print(string+" ");
		}
		System.out.println("\n");
		//System.out.println(staticArray.length);
		ArrayList<String> al = new ArrayList<String>();
		al.add("khosru");
		al.add("zaman");
		al.add("afnan");
		al.add("kamnan");
		System.out.print("ArrayList : ");
		System.out.println(al);
		for (String alist : al) {
			
			System.out.println(alist+" ");
		}
		LinkedList<String> lList = new LinkedList<String>();
		lList.add("Miraj");
		lList.add("ahmed");
		lList.add("nasser");
		lList.add("Imam");
		System.out.print("\nLinkedList : ");
		System.out.println(lList);
		for(String linkedList : lList) {
			System.out.println(linkedList);
		}
		System.out.println(lList.size());
 	}

}
