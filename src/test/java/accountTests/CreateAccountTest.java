package accountTests;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import core.SeleniumTestBase;
import pageObjects.AccountPage;
import util.PropertiesFileReader;
import util.UIUtilities;

public class CreateAccountTest extends SeleniumTestBase{

	PropertiesFileReader propertyReader = new PropertiesFileReader();
	String appName = "Sales";
	String tab = "Accounts";
	String accountName = "Auto_Cuenta_"+RandomStringUtils.randomAlphanumeric(2);
	String accountWebsite="www.Website.com";
	String accountEmployees="800";
	String accountNumber="0001";
	String accountPhone="8394587394573";
	String accountAnnualRevenue="2500000";
	String accountType="Prospect";
	String accountIndustry="Chemicals";
	
    //ADDED Extra time for Demo purposes. 
	
	@Test ( enabled = true )
	public void testCreateAccount() throws Exception {

		UIUtilities util = new UIUtilities(driver);
		AccountPage ap = new AccountPage(driver);
	
		try {
			
			ap.userLogIn(driver, propertyReader.getTestUserName(),propertyReader.getTestPassword(), appName); 
   			util.waitForPageToLoad(10000);
			ap.openTab(tab, driver);
			util.waitForElementToBeDisplayed(driver, ap.getNewRecordBtn());
			ap.getNewRecordBtn().click();
			util.waitForElementToBeDisplayed(driver, ap.getAccountName());
			ap.getAccountName().click();
   			util.waitForPageToLoad(15000);
			ap.getAccountName().sendKeys(accountName);
			util.waitForElementToBeDisplayed(driver, ap.getAccountNumber());
   			util.waitForPageToLoad(10000);

			ap.getAccountNumber().click();
			ap.getAccountNumber().sendKeys(accountNumber);
   			util.waitForPageToLoad(15000);

			util.waitForElementToBeDisplayed(driver, ap.getAccountWebSite());
			ap.getAccountWebSite().click();
			ap.getAccountWebSite().sendKeys(accountWebsite);
   			util.waitForPageToLoad(15000);

			util.waitForElementToBeDisplayed(driver, ap.getAccountEmployees());
			ap.getAccountEmployees().click();
			ap.getAccountEmployees().sendKeys(accountEmployees);
   			util.waitForPageToLoad(15000);

			util.waitForElementToBeDisplayed(driver, ap.getAccountPhone());
			ap.getAccountPhone().click();
			ap.getAccountPhone().sendKeys(accountPhone);
   			util.waitForPageToLoad(15000);

			util.waitForElementToBeDisplayed(driver, ap.getAccountAnnualRevenue());
			ap.getAccountAnnualRevenue().click();
			ap.getAccountAnnualRevenue().sendKeys(accountAnnualRevenue);
			util.waitForElementToBeDisplayed(driver, ap.getAccountType());
			ap.getAccountType().click();
   			util.waitForPageToLoad(15000);

			util.waitForElementToBeDisplayed(driver, ap.getAccountTypeOption(accountType, driver));
			ap.getAccountTypeOption(accountType, driver).click();
			util.waitForElementToBeDisplayed(driver, ap.getAccountIndustry());
			ap.getAccountIndustry().click();
   			util.waitForPageToLoad(15000);

			util.waitForElementToBeDisplayed(driver, ap.getAccountIndustryOption(accountIndustry, driver));
			ap.getAccountIndustryOption(accountIndustry, driver).click();
			util.waitForElementToBeDisplayed(driver, ap.getSaveBtn());
			ap.getSaveBtn().click();
   			util.waitForPageToLoad(100000);
            //Assert on the created account name
   			Assert.assertEquals(accountName, ap.getaccountDetailPageHeaderName().getText());
   			util.waitForPageToLoad(280000);

			System.out.println("Created Account: "+accountName);

		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		} 
		finally {
			
					
			System.out.println("testCreateAccount Test Completed");
		}
	}


}
