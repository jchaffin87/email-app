package com.johnchaffin.emailapp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmailTest {

	@Test
	public void getDepartmentReturnsSalesWhenSetDepartmentChoiceIs1() {
		Email underTest = new Email("John", "Smith");
		underTest.setDepartment(1);
		assertEquals("sales", underTest.getDepartment());
	}

	@Test
	public void getDepartmentReturnsDevWhenSetDepartmentChoiceIs2() {
		Email underTest = new Email("John", "Smith");
		underTest.setDepartment(2);
		assertEquals("dev", underTest.getDepartment());
	}

	@Test
	public void getDepartmentReturnsAcctWhenSetDepartmentChoiceIs3() {
		Email underTest = new Email("John", "Smith");
		underTest.setDepartment(3);
		assertEquals("acct", underTest.getDepartment());
	}

	@Test
	public void getDepartmentReturnsSpaceWhenSetDepartmentChoiceIsNotOneTwoOrThree() {
		Email underTest = new Email("John", "Smith");
		underTest.setDepartment(0);
		assertEquals("", underTest.getDepartment());
	}

}
