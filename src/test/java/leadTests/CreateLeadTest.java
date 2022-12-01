package leadTests;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;
import core.SeleniumTestBase;
import pageObjects.LeadPage;
import util.PropertiesFileReader;
import util.UIUtilities;

public class CreateLeadTest extends SeleniumTestBase {

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
	public void testCreateLead() throws Exception{
		UIUtilities util = new UIUtilities(driver);
		LeadPage lp = new LeadPage(driver);


		try {

			lp.userLogIn(driver, propertyReader.getTestUserName(),propertyReader.getTestPassword(), appName); 
			util.waitForPageToLoad(3000);
			lp.openTab(tab, driver);
			util.waitForElementToBeDisplayed(driver, lp.getNewRecordBtn());
			lp.getNewRecordBtn().click();
			
			util.waitForElementToBeDisplayed(driver, lp.getLeadFirstName());
			lp.getLeadFirstName().click();
			lp.getLeadFirstName().sendKeys(leadFirstName);
			
			util.waitForElementToBeDisplayed(driver, lp.getLeadLastName());
			lp.getLeadLastName().click();
			lp.getLeadLastName().sendKeys(leadLastName);
			
			util.waitForElementToBeDisplayed(driver, lp.getLeadCompany());
			lp.getLeadCompany().click();
			lp.getLeadCompany().sendKeys(leadCompany);
			
			util.waitForElementToBeDisplayed(driver, lp.getLeadPhone());
			lp.getLeadPhone().click();
			lp.getLeadPhone().sendKeys(leadPhone);
			
			util.waitForElementToBeDisplayed(driver, lp.getLeadStatus());
			lp.getLeadStatus().click();
			util.waitForElementToBeDisplayed(driver, lp.getLeadStatusOption(leadStatus, driver));
			lp.getLeadStatusOption(leadStatus, driver).click();
			
			util.waitForElementToBeDisplayed(driver, lp.getLeadSource());
			lp.getLeadSource().click();
			util.waitForElementToBeDisplayed(driver, lp.getLeadSourceOption(leadSource, driver));
			lp.getLeadSourceOption(leadSource, driver).click();
			
			util.waitForElementToBeDisplayed(driver, lp.getLeadRating());
			lp.getLeadRating().click();
			util.waitForElementToBeDisplayed(driver, lp.getLeadRatingOption(leadRating, driver));
			lp.getLeadRatingOption(leadRating, driver).click();
			
			
			lp.getSaveBtn().click(); util.waitForPageToLoad(30000);


			System.out.println("Created Lead Name : "+leadFirstName +" "+leadLastName);

		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		} 
		finally {


			System.out.println("CreateAccountTest Completed");
		}

	}
}
