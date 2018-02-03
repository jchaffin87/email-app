package com.johnchaffin.emailapp;

import java.util.Scanner;

public class EmailApp {
	public static Scanner in = new Scanner(System.in);
	public static Scanner in2 = new Scanner(System.in);
	public static Scanner in3 = new Scanner(System.in);

	public static void main(String[] args) {
		Email em1 = new Email("John", "Smith");
		System.out.println("Email created: " + em1.getFirstName() + " " + em1.getLastName());
		System.out.println("Enter Department Code.\nDEPARTMENT CODES:\n1 for Sales\n2 for Development\n3 for "
				+ "Accounting\n0 for none\nEnter department code:");

		int depChoice = in.nextInt();
		em1.setDepartment(depChoice);
		em1.setEmail(em1.getFirstName().toLowerCase() + "." + em1.getLastName().toLowerCase() + "@"
				+ em1.getDepartment() + "." + em1.getCompanySuffix());
		System.out.println(em1.showInfo());
		Boolean depSet = true;
		while (depSet) {
			System.out.println("Press 1 to set a new password.\nPress 2 to set an alternate email."
					+ "\nPress 3 to see account information again.");
			int userChoice = in2.nextInt();
			if (userChoice == 1) {
				System.out.println("Enter new password.");
				String newPassword = in3.nextLine();
				em1.changePassword(newPassword);
				System.out.println("Your new password is " + em1.getPassword() + ".");
			} else if (userChoice == 2) {
				System.out.println("Enter alternate email address.");
				String altEmail = in3.nextLine();
				em1.setAlternateEmail(altEmail);
				System.out.println("Your alternate email is " + em1.getAlternateEmail());
			} else if (userChoice == 3) {
				System.out.println(em1.showInfo());
			} else {
				System.out.println("That is not a valid response.");
			}

		}
	}
}
