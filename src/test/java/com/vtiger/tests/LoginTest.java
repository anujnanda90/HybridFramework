package com.vtiger.tests;


import org.testng.annotations.Test;

import com.vtiger.pages.HomePage;
import com.vtiger.pages.LoginPage;



public class LoginTest extends BaseTest {
	
	
	@Test
	public void LoginTC01()
	{
		String TCName = "LoginTC01";
		logger = extent.createTest(TCName);
		LoginPage lp = new LoginPage(driver,logger);
		lp.login(td.get(TCName).get("Userid"), td.get(TCName).get("Password"));
		HomePage hp = new HomePage(driver,logger);
		hp.clickLogout();
		extent.flush();
	}
	
	
	
	

}
