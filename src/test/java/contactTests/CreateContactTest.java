package contactTests;

import core.SeleniumTestBase;
import org.testng.annotations.Test;
import pageObjects.AccountPage;
import pageObjects.ContactPage;
import util.PropertiesFileReader;
import util.UIUtilities;


public class CreateContactTest extends SeleniumTestBase {

  PropertiesFileReader propertyReader = new PropertiesFileReader();

  String contactFName = "Automation";
  String contactLName = "Contact";
  String appName = "Sales";
  @Test
  public void testCreateContact() throws Exception {
    UIUtilities util = new UIUtilities(driver);
    ContactPage cp = new ContactPage(driver);
    String tab = "Contacts";

    try {

      cp.userLogIn(driver, propertyReader.getTestUserName(),propertyReader.getTestPassword(), appName);
      util.waitForPageToLoad(3000);
      cp.openTab(tab, driver);
      util.waitForElementToBeDisplayed(driver, cp.getNewRecordBtn());
      cp.getNewRecordBtn().click();
      util.waitForElementToBeDisplayed(driver, cp.getContactFName());
      cp.getContactLName().sendKeys(contactFName);
      util.waitForElementToBeDisplayed(driver, cp.getContactLName());
      cp.getContactLName().sendKeys(contactLName);
      util.waitForElementToBeDisplayed(driver, cp.getSaveBtn());
      cp.getSaveBtn().click();
      util.waitForPageToLoad(30000);

    }catch(Exception e) {
      e.printStackTrace();
      throw e;
    }
    finally {
      System.out.println("testCreateContact completed");
    }
  }
}
