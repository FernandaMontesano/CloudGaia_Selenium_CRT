package pageObjects;


import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pageConstants.AccountPageConstants;

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
	
}
