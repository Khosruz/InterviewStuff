package LInkedList;
/*LinkedList internally used by doubly linked list, its synchronized, its fast, 
 * not requirred to memory shifting if any element has removed
 * use set and dqueue interface, and best used for data manipulation.
 * */
import java.util.LinkedList;

public class LinkedLists {
	public static void main(String[] args) {
		LinkedList<String> lList = new LinkedList<String>();
		lList.add("Purpole");
		lList.add("Blue");
		lList.add("Sky Blue");
		lList.add("Green");
		lList.add("Yellow");
		lList.add("Orange");
		lList.add("Red");
		lList.add("Black");
		lList.add("Gray");
		System.out.println("Before Iteration : "+lList);
		//By Iteration
		System.out.println("After Iteration : ");
		for(String colore:lList) {
			System.out.println("\t\t "+colore);
		}
		
	}

}
