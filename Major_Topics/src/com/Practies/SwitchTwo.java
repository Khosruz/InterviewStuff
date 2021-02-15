package com.Practies;

import java.util.Scanner;

public class SwitchTwo {
	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number.");
		number = sc.nextInt();
		switch(number) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Fuk you");
			break;
			default:
				System.out.println("you are a real nigga");
		}
				
	}

}
