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
	String itemName = "Accounts";
	String accountName = "Auto_Cuenta_"+RandomStringUtils.randomAlphanumeric(16);
	String recordId = "";
	
	@Test ( enabled = true )
	public void testCrearCuentaMineria() throws Exception {

		UIUtilities util = new UIUtilities(driver);
		AccountPage ap = new AccountPage(driver);

		try {
			
			ap.userLogIn(driver, propertyReader.getTestUserName(),propertyReader.getTestPassword(), appName); 
   			util.waitForPageToLoad(3000);
			//ap.openItemFromMenu(itemName, driver);
			//util.waitForElementToBeDisplayed(driver, ap.getNewRecordBtn());
			
			System.out.println("Created Account: "+accountName);

		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		} 
		finally {
			
					
			System.out.println("VerifyCreateAccount Test Completed");
		}
	}


}
