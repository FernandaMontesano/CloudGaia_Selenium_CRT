package leadTests;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.testng.annotations.Test;
import core.SeleniumTestBase;
import pageObjects.LeadPage;
import util.PropertiesFileReader;
import util.UIUtilities;

public class ConvertLeadToOpportunityTest extends SeleniumTestBase {

	PropertiesFileReader propertyReader = new PropertiesFileReader();
	String appName = "Sales";
	String tab = "Leads";
	String leadFirstName = "FirstName_"+RandomStringUtils.randomAlphanumeric(2);
	String leadLastName = "LastName_"+RandomStringUtils.randomAlphanumeric(2);
	String leadCompany="Company_"+RandomStringUtils.randomAlphanumeric(2);
	String leadPhone="8394587394573";
	String leadStatus= "Working - Contacted";
	String leadSource= "Web";
	String leadRating= "Warm";

	

	String recordId = "";

	@Test
	public void testConvertLeadToOpportunity() throws Exception{
		UIUtilities util = new UIUtilities(driver);
		LeadPage lp = new LeadPage(driver);

		try {

			lp.userLogIn(driver, propertyReader.getTestUserName(),propertyReader.getTestPassword(), appName); 
			util.waitForPageToLoad(8000);
			lp.openTab(tab, driver);
			util.waitForElementToBeDisplayed(driver, lp.getNewRecordBtn());
			util.waitForPageToLoad(8000);

			//Select List Of Open Leads
			util.jsClick(lp.getLeadSelectListView(), driver);
			//lp.getLeadSelectListView().click();
			util.waitForPageToLoad(30000);
			util.jsClick(lp.getOpenLeadListView(), driver);
			//lp.getOpenLeadListView().click();
			//Open first Lead Record
			util.waitForPageToLoad(50000);
			util.waitForElementToBeDisplayed(driver, lp.getOpenFirstLeadRecord());
			lp.getOpenFirstLeadRecord().click();
			
			//Convert Lead
			util.waitForPageToLoad(10000);
			lp.getLeadConvertBtn().click();
			util.waitForElementToBeDisplayed(driver, lp.getLeadConvertCloseBtn());
			lp.getLeadConvertCloseBtn().click();
			util.waitForPageToLoad(25000);
			util.jsClick(lp.getLeadConvertBtn(), driver);
			util.waitForElementToBeDisplayed(driver, lp.getLeadConvertModalBtn());
			util.waitForPageToLoad(20000);
			util.jsClick(lp.getLeadConvertModalBtn(), driver);
			util.waitForPageToLoad(20000);
			util.waitForElementVisible(lp.getLeadConvertedLeadMsg());
			Assert.assertTrue(lp.getLeadConvertedLeadMsg().isDisplayed());
			
			System.out.println("Lead Converted");

		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		} 
		finally {


			System.out.println("ConvertLeadToOpportunityTest Completed");
		}

	}
}
