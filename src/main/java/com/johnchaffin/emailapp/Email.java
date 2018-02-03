package com.johnchaffin.emailapp;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail = "None set";
	private String companySuffix = "company.com";

	// Constructor to receive first and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = randomPassword(defaultPasswordLength);
	}

	// Setter for department
	public void setDepartment(int depChoice) {
		if (depChoice == 1) {
			department = "sales";
		} else if (depChoice == 2) {
			department = "dev";
		} else if (depChoice == 3) {
			department = "acct";
		} else {
			department = "";
		}
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// Generate random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int random = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(random);
		}
		return new String(password);
	}

	// Set mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}

	// Set alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}

	// Change password
	public void changePassword(String password) {
		this.password = password;
	}

	// Getters
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public String getPassword() {
		return password;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getDepartment() {
		return department;
	}

	public String getEmail() {
		return email;
	}

	public String getCompanySuffix() {
		return companySuffix;
	}

	// Method to show info
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName + "\nCOMPANY EMAIL: " + email + "\nMAILBOX CAPACITY: "
				+ mailboxCapacity + "mb" + "\nPASSWORD: " + password + "\nALTERNATE EMAIL: " + alternateEmail;
	}
}
