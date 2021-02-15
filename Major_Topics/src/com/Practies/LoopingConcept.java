package com.Practies;

public class LoopingConcept {
	static int i;
	static int j;

	public static void main(String[] args) {
		// Do While
		
			System.out.print("Do While : ");
			do {
				System.out.print(" " + j);
				j++;

			} while (j <= 10);
		
			// While Loop
			System.out.print("\nWhile : ");
			while (i <= 10) {
				System.out.print(" " + i);
				i++;
			}
		}
	
}
