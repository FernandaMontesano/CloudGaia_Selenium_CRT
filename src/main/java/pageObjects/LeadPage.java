package pageObjects;


import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pageConstants.AccountPageConstants;
import pageConstants.LeadPageConstants;

public class LeadPage extends Page {
	
	public LeadPage (WebDriver driver) {
		super(driver);
	}
	public LeadPage init(WebDriver driver)throws MalformedURLException {
		LeadPage leadPage = PageFactory.initElements(driver, LeadPage.class);
		leadPage.setDriver(driver);
		return leadPage;
	}
	
	/*
	 * Create Lead Page  General
	 */	
	@FindBy(xpath = LeadPageConstants.LEAD_FIRSTNAME)
	private WebElement leadFirstName;
	public WebElement getLeadFirstName() {
		return leadFirstName;
	}
	
	@FindBy(xpath = LeadPageConstants.LEAD_LASTNAME)
	private WebElement leadLastName;
	public WebElement getLeadLastName() {
		return leadLastName;
	}
	
	@FindBy(xpath = LeadPageConstants.LEAD_PHONE)
	private WebElement leadPhone;
	public WebElement getLeadPhone() {
		return leadPhone;
	}
	@FindBy(xpath = LeadPageConstants.LEAD_COMPANY)
	private WebElement leadCompany;
	public WebElement getLeadCompany() {
		return leadCompany;
	}
	@FindBy(xpath = LeadPageConstants.LEAD_SOURCE_FIELD)
	private WebElement leadSource;
	public WebElement getLeadSource() {
		return leadSource;
	}
	@FindBy(xpath = LeadPageConstants.LEAD_SOURCE_OPTION)
	private WebElement leadSourceOption;
	public WebElement getLeadSourceOption(String source, WebDriver driver) {
		return leadSourceOption = driver.findElement(By.xpath(LeadPageConstants.LEAD_SOURCE_OPTION.replace("+@SOURCE+", source)));
	}
	@FindBy(xpath = LeadPageConstants.LEAD_STATUS_FIELD)
	private WebElement leadStatus;
	public WebElement getLeadStatus() {
		return leadStatus;
	}
	@FindBy(xpath = LeadPageConstants.LEAD_STATUS_OPTION)
	private WebElement leadStatusOption;
	public WebElement getLeadStatusOption(String status, WebDriver driver) {
		return leadStatusOption = driver.findElement(By.xpath(LeadPageConstants.LEAD_STATUS_OPTION.replace("+@STATUS+", status)));
	}
	
	@FindBy(xpath = LeadPageConstants.LEAD_RATING_FIELD)
	private WebElement leadRating;
	public WebElement getLeadRating() {
		return leadRating;
	}
	@FindBy(xpath = LeadPageConstants.LEAD_RATING_FIELD)
	private WebElement leadRatingOption;
	public WebElement getLeadRatingOption(String rating, WebDriver driver) {
		return leadRatingOption = driver.findElement(By.xpath(LeadPageConstants.LEAD_RATING_FIELD.replace("+@RATING+", rating)));
	}
	@FindBy(xpath = LeadPageConstants.LEAD_SELECT_LIST_VIEWS)
	private WebElement leadSelectListView;
	public WebElement getLeadSelectListView() {
		return leadSelectListView;
	}
	@FindBy(xpath = LeadPageConstants.LEAD_OPENLEADS_VIEW)
	private WebElement openLeadListView;
	public WebElement getOpenLeadListView() {
		return openLeadListView;
	}
	@FindBy(xpath = LeadPageConstants.LEAD_OPEN_FIRST_RECORD)
	private WebElement openFirstLeadRecord;
	public WebElement getOpenFirstLeadRecord() {
		
		return openFirstLeadRecord;
	}
		
	@FindBy(xpath = LeadPageConstants.LEAD_CONVERT_BTN)
	private WebElement leadConvertBtn;
	public WebElement getLeadConvertBtn() {
		return leadConvertBtn;
	}
	@FindBy(xpath = LeadPageConstants.LEAD_CONVERT_MODAL_BTN)
	private WebElement leadConvertModalBtn;
	public WebElement getLeadConvertModalBtn() {
		return leadConvertModalBtn;
	}
	@FindBy(xpath = LeadPageConstants.LEAD_CONVERTED_LEAD_MSG)
	private WebElement leadConvertedLeadMsg;
	public WebElement getLeadConvertedLeadMsg() {
		return leadConvertedLeadMsg;
	}
	@FindBy(xpath = LeadPageConstants.LEAD_CONVERT_CLOSE_MODAL)
	private WebElement leadConvertCloseBtn;
	public WebElement getLeadConvertCloseBtn() {
		return leadConvertCloseBtn;
	}
}