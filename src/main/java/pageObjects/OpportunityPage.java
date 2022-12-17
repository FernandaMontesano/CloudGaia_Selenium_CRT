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

public class OpportunityPage extends Page {
    public OpportunityPage(WebDriver driver) {
        super(driver);
    }

    public OpportunityPage init(WebDriver driver) throws MalformedURLException {
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
    @FindBy(xpath = OpportunityPageConstants.QUALIFICATION_STG)
    private WebElement stageQualification;
    @FindBy(xpath = OpportunityPageConstants.NEED_ANALYSIS_STG)
    private WebElement stageNeedAnalysis;
    @FindBy(xpath = OpportunityPageConstants.VALUE_PROP_STG)
    private WebElement stageValueProp;
    @FindBy(xpath = OpportunityPageConstants.DECISION_MKS_STG)
    private WebElement stageIdDecision;
    @FindBy(xpath = OpportunityPageConstants.PERCEPTION_ANALYSIS_STG)
    private WebElement stagePerception;
    @FindBy(xpath = OpportunityPageConstants.PROPOSAL_QUOTE_STG)
    private WebElement stageProposal;
    @FindBy(xpath = OpportunityPageConstants.NEGOCIATION_STG)
    private WebElement stageNegotiation;
    @FindBy(xpath = OpportunityPageConstants.CLOSED_STG)
    private WebElement stageClosed;
    @FindBy(xpath = OpportunityPageConstants.MARK_COMPLETE_BTN)
    private WebElement markCompleteBtn;

    @FindBy(xpath = OpportunityPageConstants.MARK_CURRENTSTG_BTN)
    private WebElement markCurrentStgBtn;

    public WebElement getMarkCloseStgBtn() {
        return markCloseStgBtn;
    }

    public void setMarkCloseStgBtn(WebElement markCloseStgBtn) {
        this.markCloseStgBtn = markCloseStgBtn;
    }

    @FindBy(xpath = OpportunityPageConstants.MARK_CLOSESTG_BTN)
    private WebElement markCloseStgBtn;

    @FindBy(xpath = OpportunityPageConstants.OPP_CURRENT_NAME)
    private WebElement oppCurrentName;

    public WebElement getoppCurrentName() {
        return oppCurrentName;
    }

    public WebElement getMarkCompleteBtn() {
        return markCompleteBtn;
    }


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

    public WebElement getMarkCurrentStgBtn() {
        return markCurrentStgBtn;
    }

    public void setMarkCurrentStgBtn(WebElement markCurrentStgBtn) {
        this.markCurrentStgBtn = markCurrentStgBtn;
    }

    public void setMarkCompleteBtn(WebElement markCompleteBtn) {
        this.markCompleteBtn = markCompleteBtn;
    }


    public WebElement getStageQualification() {
        return stageQualification;
    }

    public void setStageQualification(WebElement stageQualification) {
        this.stageQualification = stageQualification;
    }

    public WebElement getStageNeedAnalysis() {
        return stageNeedAnalysis;
    }

    public void setStageNeedAnalysis(WebElement stageNeedAnalysis) {
        this.stageNeedAnalysis = stageNeedAnalysis;
    }

    public WebElement getStageValueProp() {
        return stageValueProp;
    }

    public void setStageValueProp(WebElement stageValueProp) {
        this.stageValueProp = stageValueProp;
    }

    public WebElement getStageIdDecision() {
        return stageIdDecision;
    }

    public void setStageIdDecision(WebElement stageIdDecision) {
        this.stageIdDecision = stageIdDecision;
    }

    public WebElement getStagePerception() {
        return stagePerception;
    }

    public void setStagePerception(WebElement stagePerception) {
        this.stagePerception = stagePerception;
    }

    public WebElement getStageProposal() {
        return stageProposal;
    }

    public void setStageProposal(WebElement stageProposal) {
        this.stageProposal = stageProposal;
    }

    public WebElement getStageNegotiation() {
        return stageNegotiation;
    }

    public void setStageNegotiation(WebElement stageNegotiation) {
        this.stageNegotiation = stageNegotiation;
    }

    public WebElement getStageClosed() {
        return stageClosed;
    }

    public void setStageClosed(WebElement stageClosed) {
        this.stageClosed = stageClosed;
    }


}

