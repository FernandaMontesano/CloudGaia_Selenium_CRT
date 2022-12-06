package pageObjects;


import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pageConstants.AccountPageConstants;
import pageConstants.LeadPageConstants;

public class AccountPage extends Page {
	
	public AccountPage (WebDriver driver) {
		super(driver);
	}
	public AccountPage init(WebDriver driver)throws MalformedURLException {
		AccountPage accountPage = PageFactory.initElements(driver, AccountPage.class);
		accountPage.setDriver(driver);
		return accountPage;
	}
	
	/*
	 * Create Account Page  General
	 */	
	@FindBy(xpath = AccountPageConstants.ACCOUNT_NAME)
	private WebElement accountccName;
	public WebElement getAccountName() {
		return accountccName;
	}
	@FindBy(xpath = AccountPageConstants.ACCOUNT_NUMBER)
	private WebElement accountNumber;
	public WebElement getAccountNumber() {
		return accountNumber;
	}
	@FindBy(xpath = AccountPageConstants.ACCOUNT_WEBSITE)
	private WebElement accountWebsite;
	public WebElement getAccountWebSite() {
		return accountWebsite;
	}
	@FindBy(xpath = AccountPageConstants.ACCOUNT_EMPLOYEES)
	private WebElement accountEmployees;
	public WebElement getAccountEmployees() {
		return accountEmployees;
	}
	@FindBy(xpath = AccountPageConstants.ACCOUNT_PHONE)
	private WebElement accountPhone;
	public WebElement getAccountPhone() {
		return accountPhone;
	}
	@FindBy(xpath = AccountPageConstants.ACCOUNT_TYPE_FIELD)
	private WebElement accountType;
	public WebElement getAccountType() {
		return accountType;
	}
	@FindBy(xpath = AccountPageConstants.ACCOUNT_TYPE_OPTION)
	private WebElement accountTypeOption;
	public WebElement getAccountTypeOption(String type, WebDriver driver) {
		return accountTypeOption = driver.findElement(By.xpath(AccountPageConstants.ACCOUNT_TYPE_OPTION.replace("+@TYPE+", type)));
	}
	@FindBy(xpath = AccountPageConstants.ACCOUNT_ANNUAL_REVENUE)
	private WebElement accountAnualRevenue;
	public WebElement getAccountAnnualRevenue() {
		return accountAnualRevenue;
	}
	@FindBy(xpath = AccountPageConstants.ACCOUNT_INDUSTRY_FIELD)
	private WebElement accountIndustry;
	public WebElement getAccountIndustry() {
		return accountIndustry;
	}
	@FindBy(xpath = AccountPageConstants.ACCOUNT_INDUSTRY_OPTION)
	private WebElement accountIndustryOption;
	public WebElement getAccountIndustryOption(String industry, WebDriver driver) {
		return accountIndustryOption = driver.findElement(By.xpath(AccountPageConstants.ACCOUNT_INDUSTRY_OPTION.replace("+@INDUSTRY+", industry)));
	}
	
	/* Account Detail Page elements
	 */	
	@FindBy(xpath = AccountPageConstants.ACCOUNT_DP_HEADER_NAME)
	private WebElement accountDetailPageHeaderName;
	public WebElement getaccountDetailPageHeaderName() {
		return accountDetailPageHeaderName;
	}
}
