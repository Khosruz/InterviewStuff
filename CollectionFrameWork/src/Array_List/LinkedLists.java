package Array_List;

import java.util.LinkedList;

public class LinkedLists {
	public static void main(String[] args) {
		LinkedList<Integer> lList = new LinkedList<Integer>();
		lList.add(12355);
		lList.add(1987);
		lList.add(32);
		lList.add(12398);
		System.out.println("Before Iteration : ");
		System.out.println(lList);
		
		System.out.println("\nAfter iteration Iteration : ");
		for(Integer ff : lList) {
			System.out.println(ff);
		}
		
	}

}
