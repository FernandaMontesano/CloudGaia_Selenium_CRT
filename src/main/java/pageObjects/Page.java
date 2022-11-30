package pageObjects;

import java.net.MalformedURLException;
import java.util.concurrent.TimeoutException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pageConstants.AccountPageConstants;
import pageConstants.Page_Constants;
import util.PropertiesFileReader;
import util.UIUtilities;

public class Page {
	
	protected WebDriver driver;
	
	public Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void getDriver(WebDriver driver) {
		this.driver = driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	
	//Salesforce Login Page Methods. 
	
	@FindBy(xpath =Page_Constants.USERNAME_TXT_FIELD)
	private WebElement loginPageUserName;
	public WebElement getLoginPageUserName() {
		return loginPageUserName;
	}
	
	@FindBy(xpath = Page_Constants.PASSWORD_TXT_FIELD)
	private WebElement loginPagePassword;
	public WebElement getLoginPagePassword() {
		return loginPagePassword;
	}
	@FindBy(xpath = Page_Constants.LOGIN_BTN)
	private WebElement loginPageLoginBtn;
	public WebElement getLoginPageLoginBtn() {
		return loginPageLoginBtn;
	}
	//Salesforce app launcher
	
	@FindBy(xpath =Page_Constants.APP_LAUNCHER_ICON)
	private WebElement appLauncherIcon;
	public WebElement getAppLauncherIcon() {
		return appLauncherIcon;
	}
	@FindBy(xpath =Page_Constants.APP_VIEW_ALL_LNK)
	private WebElement appViewAllLnk;
	public WebElement getAppViewAllLnk() {
		return appViewAllLnk;
	}
	@FindBy(xpath =Page_Constants.APP_SEARCH_TXT_FIELD)
	private WebElement appSearchField;
	public WebElement getAppSearchField() {
		return appSearchField;
	}
	@FindBy(xpath =Page_Constants.APP_SEARCH_FOUND_ITEM)
	private WebElement appSearchFoundItem;
	public WebElement getAppSearchFoundItem() {
		
		return appSearchFoundItem;
	}
	
	//YPF Agro app

	@FindBy(xpath = Page_Constants.APP_PAGE_TITLE)
	private WebElement appPageTitle;
	public WebElement getAppPageTitle(String appName, WebDriver driver) {
		return appPageTitle = driver.findElement(By.xpath(Page_Constants.APP_PAGE_TITLE.replace("+@APPNAME+", appName)));
	}
	@FindBy(xpath = Page_Constants.APP_TAB_NAME)
	private WebElement appTabName;
	public WebElement getAppTabName(String tabName, WebDriver driver) {
		return appTabName = driver.findElement(By.xpath(Page_Constants.APP_TAB_NAME.replace("+@TAB+", tabName)));
	}
	@FindBy(xpath = Page_Constants.APP_IFRAME)
	private WebElement appIframe;
	public WebElement getAppIframe() {
		return appIframe;
	}
	
	
	// Page Buttons
	
	//Create New Record
	
	
	@FindBy(xpath = Page_Constants.NEW_RECORD_BTN)
	private WebElement newRecordBtn;
	public WebElement getNewRecordBtn() {
		return newRecordBtn;
	}
	
	@FindBy(xpath = Page_Constants.SAVE_BTN)
	private WebElement saveBtn;
	public WebElement getSaveBtn() {
		return saveBtn;
	}	
	
public  WebDriver userLogIn (WebDriver driver, String username, String password) throws Exception {
		UIUtilities util = new UIUtilities(driver);
		PropertiesFileReader prop = new PropertiesFileReader();
		driver.get(prop.getApplicationUrl());
		util.waitForElementToBeDisplayed(driver, getLoginPageUserName());
		getLoginPageUserName().sendKeys(username);
		util.waitForElementToBeDisplayed(driver, getLoginPagePassword());
		getLoginPagePassword().sendKeys(password);
		util.waitForElementToBeDisplayed(driver, getLoginPageLoginBtn());
		getLoginPageLoginBtn().click();
		return driver;
		
	}
	public WebDriver userLogIn (WebDriver driver, String username, String password, String appName) throws Exception {
		UIUtilities util = new UIUtilities(driver);
		PropertiesFileReader prop = new PropertiesFileReader();
		String url = prop.getApplicationUrl();
		driver.get(url);
		util.waitForElementToBeDisplayed(driver, getLoginPageUserName());
		getLoginPageUserName().sendKeys(username);
		util.waitForElementToBeDisplayed(driver, getLoginPagePassword());
		getLoginPagePassword().sendKeys(password);
		util.waitForElementToBeDisplayed(driver, getLoginPageLoginBtn());
		getLoginPageLoginBtn().click();
		util.waitForPageToLoad(5000);
		openSalesforceApp(driver, appName);
		return driver;
	}
	public void openSalesforceApp(WebDriver driver, String appName) throws TimeoutException, InterruptedException  {
		driver.navigate().refresh();
		UIUtilities util = new UIUtilities (driver);
		util.waitForPageToLoad(5000);
		getAppLauncherIcon().click();
		util.waitForPageToLoad(3000);
		util.jsClick(getAppViewAllLnk(), driver);
		//getAppViewAllLnk().click();
		util.waitForPageToLoad(4000);
		util.moveToElementAndClick(driver, getAppSearchField());
		util.waitForPageToLoad(3000);
		getAppSearchField().sendKeys(appName);
		util.waitForPageToLoad(6000);
		util.moveToElementAndClick(driver,getAppSearchFoundItem());
		util.waitForPageToLoad(16000);
		Assert.assertTrue(getAppPageTitle(appName, driver).isDisplayed(), "There was a problem opening the required app.");
		
		}
	
	
	public void openTab(String tabName, WebDriver driver) throws Exception {
		
		UIUtilities util = new UIUtilities (driver);
				util.waitForPageToLoad(1000);
		util.waitForElementToBeDisplayed(driver, getAppTabName(tabName, driver));
		getAppTabName(tabName, driver).click();
		util.waitForPageToLoad(3000);
		
	}

	public  String getRecordIdFromUrl(WebDriver driver) throws MalformedURLException, InterruptedException {
		Thread.sleep(3000);
		String[] url = driver.getCurrentUrl().split("/");
		String recordId = url[6];
		return recordId;
	}
}
