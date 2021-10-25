package com.avesdo.tests.cases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.avesdo.pages.common.LogoutPage;
import com.avesdo.tests.pages.BaseTest;
import com.avesdo.tests.pages.TestClosingPage;
import com.avesdo.tests.pages.TestLoginPage;
import com.avesdo.tests.pages.TestSelectBuildingPage;
import com.avesdo.tests.pages.TestStaffManagement;
import com.avesdo.tests.pages.TestStaffUser;

public class TestClosing extends BaseTest {
	
	@Test(priority=0)
	public void login() throws Exception{
		TestLoginPage testLoginPage = new TestLoginPage(driver,configurationReader,browserName,"common.xlsx","Login");
		boolean status = testLoginPage.login();
		handleAssert(status);
	}
	
	@Test(priority=1, dependsOnMethods={"login"})
	public void selectBuilding() throws Exception{
		TestSelectBuildingPage testSelectBuildingPage = new TestSelectBuildingPage(driver,configurationReader, browserName);
		boolean status = testSelectBuildingPage.selectBuilding();
		handleAssert(status);
	}

	
	@Test(priority=2, dependsOnMethods={"selectBuilding"})
	public void closingEstimatedCompletion() throws Exception{
		TestClosingPage testClosingPage = new TestClosingPage(driver,configurationReader, browserName);
		boolean status = testClosingPage.closingEstimatedAndActualCompletion();
		handleAssert(status);
	}
	
	
	
	
	
	
	
}
