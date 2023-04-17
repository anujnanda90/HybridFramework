package com.vtiger.tests;

import org.testng.annotations.Test;

import com.vtiger.pages.HomePage;
import com.vtiger.pages.LeadPage;
import com.vtiger.pages.LoginPage;

public class LeadTest extends BaseTest {
	
	@Test
	public void CreateLeadTC02()
	{
		String TCName = "CreateLeadTC02";
		logger = extent.createTest(TCName);
		LoginPage lp = new LoginPage(driver,logger);
		lp.login(td.get(TCName).get("Userid"), td.get(TCName).get("Password"));
		HomePage hp = new HomePage(driver,logger);
		hp.clickNewLead();
		LeadPage ldp = new LeadPage(driver,logger);
		ldp.CreateLeadwithMandatoryFields(td.get(TCName).get("LastName"), td.get(TCName).get("Company"));
		ldp.verifyLeadCreation(td.get(TCName).get("LastName"), td.get(TCName).get("Company"));
		ldp.clickLeads();
		ldp.searchLead(td.get(TCName).get("LastName"), td.get(TCName).get("Company"));
		ldp.verifySingleRecordSearch(td.get(TCName).get("LastName"), td.get(TCName).get("Company"));		
		hp.clickLogout();
		extent.flush();
	}

}
