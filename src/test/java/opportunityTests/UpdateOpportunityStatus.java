package opportunityTests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import core.SeleniumTestBase;
import org.apache.commons.lang3.RandomStringUtils;
import pageObjects.OpportunityPage;
import util.PropertiesFileReader;
import util.UIUtilities;

public class UpdateOpportunityStatus extends SeleniumTestBase {
    PropertiesFileReader propertyReader = new PropertiesFileReader();
    String oppName = "Auto_Opp" + RandomStringUtils.randomAlphanumeric(16);
    String closeDate = "29/12/2022";

    String appName = "Sales";
    String oppStage = "Prospecting";


    @Test
    public void UpdateOppStage() throws Exception {
        UIUtilities util = new UIUtilities(driver);
        OpportunityPage op = new OpportunityPage(driver);
        String tab = "Opportunities";

        try {

            op.userLogIn(driver, propertyReader.getTestUserName(), propertyReader.getTestPassword(), appName);
            util.waitForPageToLoad(3000);
            op.openTab(tab, driver);
            util.waitForElementToBeDisplayed(driver, op.getNewRecordBtn());
            op.getNewRecordBtn().click();
            util.waitForElementToBeDisplayed(driver, op.getOppName());
            op.getOppName().sendKeys(oppName);
            util.waitForElementToBeDisplayed(driver, op.getCloseDate());
            op.getCloseDate().sendKeys(closeDate);
            util.waitForElementToBeDisplayed(driver, op.getStageCombo());
            op.getStageCombo().click();
            util.waitForElementToBeDisplayed(driver, op.getStage(oppStage, driver));
            op.getStage(oppStage, driver).click();
            util.waitForElementToBeDisplayed(driver, op.getSaveBtn());
            op.getSaveBtn().click();
            util.jsClick(op.getStageQualification(), driver);
            util.jsClick(op.getMarkCurrentStgBtn(), driver);
            util.jsClick(op.getStageNeedAnalysis(), driver);
            util.jsClick(op.getMarkCurrentStgBtn(), driver);
            util.jsClick(op.getStageValueProp(), driver);
            util.jsClick(op.getMarkCurrentStgBtn(), driver);
            util.jsClick(op.getStageIdDecision(), driver);
            util.jsClick(op.getMarkCurrentStgBtn(), driver);
            util.jsClick(op.getStagePerception(), driver);
            util.jsClick(op.getMarkCurrentStgBtn(), driver);
            util.jsClick(op.getStageProposal(), driver);
            util.jsClick(op.getMarkCurrentStgBtn(), driver);
            util.jsClick(op.getStageNegotiation(), driver);
            util.jsClick(op.getMarkCurrentStgBtn(), driver);
            util.jsClick(op.getStageClosed(), driver);
            util.jsClick(op.getMarkCloseStgBtn(), driver);

        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            System.out.println("Create opportunity test completed");
        }
    }

}