package com.Practies;

import java.util.Scanner;

public class switchCale {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 int marks = sc.nextInt();
		 switch (marks) {
		 
		case 1:
			if (marks<20) {
				System.out.println("Not good");
				break;			
			}
		case 2:
			if(marks<15) {
				System.out.println("Not Good");
				break;
			}
		case 3:
			if (marks==13) {
				System.out.println("Real Nigga");
				break;
			}
		default:
			System.out.println("You Got It!!!");
			
		}
	}

}
