package pageObjects;


import java.net.MalformedURLException;

import org.openqa.selenium.By;
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
		AccountPage accountPageInd = PageFactory.initElements(driver, AccountPage.class);
		accountPageInd.setDriver(driver);
		return accountPageInd;
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
	/*
	 * @FindBy(xpath = AccountPageConstants.ACCOUNT_SUBCATEGORY_FIELD) private
	 * WebElement accountCPAccountSubcategoria; public WebElement
	 * getAccountCPAccountSubcategoria() { return accountCPAccountSubcategoria; }
	 * 
	 * @FindBy(xpath = AccountPageConstants.ACCOUNT_SUBCATEGORY_OPTION) private
	 * WebElement accountCPSubcategoriaOption; public WebElement
	 * getAccountCPSubcategoriaOption(String subcategory, WebDriver driver) { return
	 * accountCPSubcategoriaOption =
	 * driver.findElement(By.xpath(AccountPageConstants.ACCOUNT_SUBCATEGORY_OPTION.
	 * replace("+@SUBCATEGORY+", subcategory))); }
	 * 
	 * @FindBy(xpath = AccountPageConstants.ACCOUNT_GEOGRAPHIC_REGION_FIELD) private
	 * WebElement accountCPAccountRegionGeografica; public WebElement
	 * getAccountCPAccountRegionGeografica() { return
	 * accountCPAccountRegionGeografica; }
	 * 
	 * @FindBy(xpath = AccountPageConstants.ACCOUNT_GEOGRAPHIC_REGION_OPTION)
	 * private WebElement accountCPRegionGeograficaOption; public WebElement
	 * getAccountCPRegionGeograficaOption(String geographicRegion, WebDriver driver)
	 * { return accountCPRegionGeograficaOption =
	 * driver.findElement(By.xpath(AccountPageConstants.
	 * ACCOUNT_GEOGRAPHIC_REGION_OPTION.replace("+@GEOGRAPHIC_REGION+",
	 * geographicRegion))); }
	 * 
	 * @FindBy(xpath = AccountPageConstants.ACCOUNT_REGIONAL_FIELD) private
	 * WebElement accountCPAccountRegional; public WebElement
	 * getAccountCPAccountRegional() { return accountCPAccountRegional; }
	 * 
	 * @FindBy(xpath = AccountPageConstants.ACCOUNT_REGIONAL_OPTION) private
	 * WebElement accountCPRegionalOption; public WebElement
	 * getAccountCPRegionalOption(String regional, WebDriver driver) { return
	 * accountCPRegionalOption =
	 * driver.findElement(By.xpath(AccountPageConstants.ACCOUNT_REGIONAL_OPTION.
	 * replace("+@REGIONAL+", regional))); }
	 * 
	 * @FindBy(xpath = AccountPageConstants.ACCOUNT_PROCESS_TYPE_FIELD) private
	 * WebElement accountCPProcessType; public WebElement getAccountCPProcessType()
	 * { return accountCPProcessType; }
	 * 
	 * @FindBy(xpath = AccountPageConstants.ACCOUNT_PROCESS_TYPE_OPTION) private
	 * WebElement accountCPProcessTypeOption; public WebElement
	 * getAccountCPProcessTypeOption(String processType, WebDriver driver) { return
	 * accountCPProcessTypeOption =
	 * driver.findElement(By.xpath(AccountPageConstants.ACCOUNT_PROCESS_TYPE_OPTION.
	 * replace("+@PROCESS_TYPE+", processType))); }
	 */

}
