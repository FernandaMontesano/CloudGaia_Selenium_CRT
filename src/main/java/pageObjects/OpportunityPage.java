package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageConstants.AccountPageConstants;
import pageConstants.ContactPageConstants;
import pageConstants.OpportunityPageConstants;

import java.net.MalformedURLException;

public class OpportunityPage extends Page{
        public OpportunityPage (WebDriver driver) {
            super(driver);
        }
        public OpportunityPage init(WebDriver driver)throws MalformedURLException {
            OpportunityPage opportunityPage = PageFactory.initElements(driver, OpportunityPage.class);
            opportunityPage.setDriver(driver);
            return opportunityPage;
        }

        //Create opportunity page
        @FindBy(xpath = OpportunityPageConstants.OPP_NAME)
        private WebElement oppName;
        @FindBy(xpath = OpportunityPageConstants.OPP_CLOSEDATE)
        private WebElement closeDate;

        @FindBy(xpath = OpportunityPageConstants.OPP_STAGE_COMBO)
        private WebElement stageCombo;
        @FindBy(xpath = OpportunityPageConstants.OPP_STAGE)
        private WebElement stageOption;


        //Getters and setters
        public WebElement getOppName() {
            return oppName;
        }
        public void setOppName(WebElement oppName) {
            this.oppName = oppName;
        }
        public WebElement getCloseDate() {
            return closeDate;
        }
        public void setCloseDate(WebElement closeDate) {
            this.closeDate = closeDate;
        }
        public WebElement getStage(String stage, WebDriver driver) {
            return stageOption = driver.findElement(By.xpath(OpportunityPageConstants.OPP_STAGE.replace("+@STAGE+", stage)));
        }
        public void setStage(WebElement stage) {
            this.stageOption = stage;
        }
        public WebElement getStageCombo() {
            return stageCombo;
        }

        public void setStageCombo(WebElement stageCombo) {
            this.stageCombo = stageCombo;
        }



}

