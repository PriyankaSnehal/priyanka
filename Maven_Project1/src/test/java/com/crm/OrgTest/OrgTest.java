package com.crm.OrgTest;

import org.testng.annotations.Test;

public class OrgTest {
@Test(groups="smokeTest")
	public void CreateOrgTest()
	{
		System.out.println("org is created succesfully");
	}
@Test(groups="smokeTest")
	public void EditOrgTest()
	{
		System.out.println("edited succesfully");
	}
}
