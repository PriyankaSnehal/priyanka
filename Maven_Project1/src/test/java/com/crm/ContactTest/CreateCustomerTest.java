package com.crm.ContactTest;

import org.testng.annotations.Test;

public class CreateCustomerTest {
	@Test
	public void CreateCustomerTest()
	{
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		System.out.println("execute test1");
		System.out.println("========="+USERNAME);
		System.out.println("========="+PASSWORD);
	}

}
