package opportunityTests;

import org.testng.annotations.Test;

import core.SeleniumTestBase;
import org.apache.commons.lang3.RandomStringUtils;
import pageObjects.OpportunityPage;
import util.PropertiesFileReader;
import util.UIUtilities;

public class CreateOpportunityTest extends SeleniumTestBase {
  PropertiesFileReader propertyReader = new PropertiesFileReader();
  String oppName = "Auto_Opp"+ RandomStringUtils.randomAlphanumeric(16);
  String closeDate = "29/12/2022";

  String appName = "Sales";
  String oppStage = "Prospecting";



  @Test
  public void createOpp() throws Exception {
    UIUtilities util = new UIUtilities(driver);
    OpportunityPage op = new OpportunityPage(driver);
    String tab = "Opportunities";



    try {

      op.userLogIn(driver, propertyReader.getTestUserName(),propertyReader.getTestPassword(), appName);
      util.waitForPageToLoad(3000);
      op.openTab(tab, driver);
      util.waitForElementToBeDisplayed(driver, op.getNewRecordBtn());
      op.getNewRecordBtn().click();
      util.waitForElementToBeDisplayed(driver, op.getOppName());
      op.getOppName().sendKeys(oppName);
      util.waitForElementToBeDisplayed(driver, op.getCloseDate());
      op.getCloseDate().sendKeys(closeDate);
      util.waitForElementToBeDisplayed(driver, op.getStageCombo());
      util.waitForPageToLoad(15000);
      op.getStageCombo().click();
      util.waitForElementToBeDisplayed(driver, op.getStage(oppStage, driver));
      op.getStage(oppStage, driver).click();
      util.waitForPageToLoad(15000);

      util.waitForElementToBeDisplayed(driver, op.getSaveBtn());

      op.getSaveBtn().click();
      util.waitForPageToLoad(30000);

    }catch(Exception e) {
      e.printStackTrace();
      throw e;
    }
    finally {
      System.out.println("Create opportunity test completed");
    }
  }

}