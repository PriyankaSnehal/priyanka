package com.crm.ContactTest;

import org.testng.annotations.Test;

public class ContactTest {
	@Test(groups="smokeTest")

	public void CreateContactTest()
	{
		System.out.println("contact is created successfully");
	}
	@Test(groups="smokeTest")
	public void EditContactTest()
	{
		System.out.println("contact is edited successfully");
	}
}
