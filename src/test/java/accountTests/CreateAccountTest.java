package accountTests;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import core.SeleniumTestBase;
import pageObjects.AccountPage;
import util.PropertiesFileReader;
import util.UIUtilities;

public class CreateAccountTest extends SeleniumTestBase{

	PropertiesFileReader propertyReader = new PropertiesFileReader();
	String appName = "Sales";
	String tab = "Accounts";
	String accountName = "Auto_Cuenta_"+RandomStringUtils.randomAlphanumeric(16);
	String accountWebsite="www.Website.com";
	String accountEmployees="800";
	String accountNumber="0001";
	String accountPhone="8394587394573";

	String recordId = "";
	
	@Test ( enabled = true )
	public void testCreateAccount() throws Exception {

		UIUtilities util = new UIUtilities(driver);
		AccountPage ap = new AccountPage(driver);

		try {
			
			ap.userLogIn(driver, propertyReader.getTestUserName(),propertyReader.getTestPassword(), appName); 
   			util.waitForPageToLoad(3000);
			ap.openTab(tab, driver);
			util.waitForElementToBeDisplayed(driver, ap.getNewRecordBtn());
			ap.getNewRecordBtn().click();
			util.waitForElementToBeDisplayed(driver, ap.getAccountName());
			ap.getAccountName().click();
			ap.getAccountName().sendKeys(accountName);
			util.waitForElementToBeDisplayed(driver, ap.getAccountNumber());
			ap.getAccountNumber().click();
			ap.getAccountName().sendKeys(accountNumber);
			util.waitForElementToBeDisplayed(driver, ap.getAccountWebSite());
			ap.getAccountWebSite().click();
			ap.getAccountWebSite().sendKeys(accountWebsite);
			util.waitForElementToBeDisplayed(driver, ap.getAccountEmployees());
			ap.getAccountEmployees().click();
			ap.getAccountEmployees().sendKeys(accountEmployees);
			util.waitForElementToBeDisplayed(driver, ap.getAccountPhone());
			ap.getAccountPhone().click();
			ap.getAccountPhone().sendKeys(accountPhone);
			util.waitForElementToBeDisplayed(driver, ap.getSaveBtn());
			ap.getSaveBtn().click();
   			util.waitForPageToLoad(30000);

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
